package de.i3mainz.flexgeo.portal.liferay.timechart.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import net.opengis.om.x10.ObservationCollectionDocument;
import net.opengis.om.x10.ObservationCollectionType;

import org.apache.xmlbeans.XmlObject;
import org.n52.oxf.OXFException;
import org.n52.oxf.feature.OXFFeatureCollection;
import org.n52.oxf.feature.OXFObservationCollectionType;
import org.n52.oxf.ows.ExceptionReport;
import org.n52.oxf.xmlbeans.parser.XMLBeansParser;
import org.n52.oxf.xmlbeans.parser.XMLHandlingException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.portlet.context.PortletApplicationContextUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import de.i3mainz.springframework.swe.n52.sos.core.SOSTemplate;

public class TimeChartPortlet extends MVCPortlet {

    private static Log LOG = LogFactoryUtil.getLog(TimeChartPortlet.class);

    @Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {

        getContextBean();

        if ("loadChartData".equals(ParamUtil.getString(resourceRequest,
                "getRequest"))) {

            String bbox = ParamUtil.getString(resourceRequest, "reqbbox", null);
            ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest
                    .getAttribute(WebKeys.THEME_DISPLAY);
            Object tmpObject = themeDisplay.getLayout().getExpandoBridge()
                    .getAttribute("reportID");
            Long themeID;
            if (tmpObject instanceof Long) {
                themeID = (Long) tmpObject;
            } else if (tmpObject instanceof Integer) {
                themeID = new Long((Integer) tmpObject);
            } else if (tmpObject instanceof String) {
                themeID = Long.parseLong(tmpObject.toString());
            } else {
                themeID = new Long(0);
            }
            LOG.info("REPORTID: " + themeID);
            LOG.info("BoundingBox from Request: " + bbox);

            PortletPreferences portletPreferences = resourceRequest
                    .getPreferences();
            String portletResource = ParamUtil.getString(resourceRequest,
                    "portletResource");

            if (Validator.isNotNull(portletResource)) {
                try {
                    portletPreferences = PortletPreferencesFactoryUtil
                            .getPortletSetup(resourceRequest, portletResource);
                } catch (PortalException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SystemException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            int precision = GetterUtil.getInteger(portletPreferences.getValue(
                    "aggregationprecision",
                    String.valueOf(Calendar.HOUR_OF_DAY)));

            ChartDataLoader chartData = new WFSChartDataLoader(themeID, bbox,
                    precision);
            chartData.write(resourceResponse.getPortletOutputStream());

        }
    }

    public void getContextBean() {

        PortletContext pc = this.getPortletContext();
        ApplicationContext context = PortletApplicationContextUtils
                .getWebApplicationContext(pc);

        // getting settings as object
        SOSTemplate template = (SOSTemplate) context.getBean("sosReader");
        List<String> observedProperties = new ArrayList<String>();
        observedProperties.add("urn:ogc:def:dataType:OGC:1.1:string");
        try {
//            IFeatureStore featureStore = new SOSObservationStore(
//                    template.getObservation("Twitter_Sentiment",
//                            observedProperties));
//            OXFFeatureCollection oxfFeatureCollection = featureStore
//                    .unmarshalFeatures();
//            
//            LOG.info("Observation-SIZE: "+oxfFeatureCollection.size());
//
//            for (Iterator<OXFFeature> itr = oxfFeatureCollection.iterator(); itr
//                    .hasNext();) {
//                OXFFeature feature = itr.next();
//                LOG.info("FeatureID: "+feature.getID());
//            }
            XmlObject xmlObject = XMLBeansParser.parse(template.getObservation("Twitter_Sentiment",
                  observedProperties).getIncomingResultAsStream(), false);
            ObservationCollectionDocument obsCollectionDoc = (ObservationCollectionDocument) xmlObject;
            ObservationCollectionType observation = obsCollectionDoc.getObservationCollection();
            LOG.info("Observation-ID: " +observation.getId());
            OXFObservationCollectionType type = new OXFObservationCollectionType();
            OXFFeatureCollection featureCollection = new OXFFeatureCollection(observation.getId(), type);
            //LOG.info(oxfFeatureCollection.size());
            
            //LOG.info("XML-TEXT: "+xmlObject.xmlText());
        } catch (OXFException e) {
            LOG.error("Problem with OXF-Framework while SOS-Request", e);
        } catch (ExceptionReport e) {
            LOG.error("Error in SOS-Request", e);
        } catch (XMLHandlingException e) {
            LOG.error("XML-Handling failed", e);
        }

    }
}
