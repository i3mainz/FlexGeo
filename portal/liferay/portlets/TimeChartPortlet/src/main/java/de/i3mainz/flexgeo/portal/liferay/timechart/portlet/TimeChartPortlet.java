package de.i3mainz.flexgeo.portal.liferay.timechart.portlet;

import java.io.IOException;
import java.util.Calendar;

import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

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

public class TimeChartPortlet extends MVCPortlet {

	private static Log LOG = LogFactoryUtil.getLog(TimeChartPortlet.class);

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {

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
					"aggregationprecision", String.valueOf(Calendar.HOUR_OF_DAY)));

			ChartDataLoader chartData = new WFSChartDataLoader(themeID, bbox,
					precision);
			chartData.write(resourceResponse.getPortletOutputStream());

		}
	}
}
