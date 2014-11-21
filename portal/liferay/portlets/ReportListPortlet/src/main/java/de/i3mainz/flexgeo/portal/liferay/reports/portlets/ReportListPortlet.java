package de.i3mainz.flexgeo.portal.liferay.reports.portlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.client.RestTemplate;

import com.liferay.portal.NoSuchLayoutException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutConstants;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.LayoutPrototypeLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.util.bridges.mvc.MVCPortlet;

import de.i3mainz.flexgeo.portal.liferay.reports.portlets.model.Report;

public class ReportListPortlet extends MVCPortlet {

    private static Log LOG = LogFactoryUtil.getLog(ReportListPortlet.class);

    private RestTemplate rest = new RestTemplate();
    private Map<Long, Report> reports;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liferay.util.bridges.mvc.MVCPortlet#doView(javax.portlet.RenderRequest
     * , javax.portlet.RenderResponse)
     */
    @Override
    public void doView(RenderRequest renderRequest,
            RenderResponse renderResponse) throws IOException, PortletException {

        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
                .getAttribute(WebKeys.THEME_DISPLAY);

        String url = "http://tweetmap.hs-mainz.de/twittersna/php/Themen.php";
        String jsonresult = rest.getForObject(url, String.class);
        try {
            reports = createThemenList(
                    JSONFactoryUtil.createJSONArray(jsonresult), themeDisplay);
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        renderRequest.setAttribute("tweetmap-reports", new ArrayList<Report>(
                reports.values()));

        super.doView(renderRequest, renderResponse);
    }

    @ProcessAction(name = "addReportPage")
    public void addReportPage(ActionRequest actionRequest,
            ActionResponse actionResponse) throws Exception {
        LOG.info("AddReportPage: Hier kommt was an.");
        String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
        LOG.info("Das ist mein Command: " + cmd);
        Long reportID = ParamUtil.getLong(actionRequest, "reportID");
        LOG.info("ReportID: " + reportID);
        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest
                .getAttribute(WebKeys.THEME_DISPLAY);

        if (cmd.equalsIgnoreCase(Constants.ADD) && reportID != null) {
            try {
                Report report = reports.get(reportID);
                Long userId = themeDisplay.getUserId();
                LOG.info("UserId: " + userId);
                Long groupId = themeDisplay.getLayout().getGroupId();
                LOG.info("GroupID: " + groupId);
                Layout parentLayout = LayoutLocalServiceUtil
                        .getFriendlyURLLayout(groupId, false, "/reports");
                Long parentLayoutId = parentLayout.getLayoutId();
                LOG.info("ParentLayout: " + parentLayoutId);
                Layout layout = LayoutLocalServiceUtil.addLayout(userId,
                        groupId, false, parentLayoutId, report.getTitel(),
                        report.getTitel(), "", LayoutConstants.TYPE_PORTLET,
                        true, "/reports/" + report.getId(),
                        new ServiceContext());
                LayoutLocalServiceUtil.updateLayout(
                        layout.getGroupId(),
                        layout.isPrivateLayout(),
                        layout.getLayoutId(),
                        LayoutPrototypeLocalServiceUtil
                                .getLayoutPrototype(13754).getLayout()
                                .getTypeSettings());
                ExpandoBridge expb = layout.getExpandoBridge();
                if (expb != null) {
                    expb.setAttribute("reportID", report.getId());
                    // LayoutLocalServiceUtil.updateLayout(layout);
                }
                report.setReportPlid(layout.getPlid());
            } catch (Exception e) {
                LOG.error(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @ProcessAction(name = "removeReportPage")
    public void removeReportPage(ActionRequest actionRequest,
            ActionResponse actionResponse) throws Exception {
        LOG.info("AddReportPage: Hier kommt was an.");
        String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
        LOG.info("Das ist mein Command: " + cmd);
        Long reportID = ParamUtil.getLong(actionRequest, "reportID");
        LOG.info("Lösche ReportID: " + reportID);

        if (cmd.equalsIgnoreCase(Constants.DELETE) && reportID != null) {
            Report report = reports.get(reportID);
            if (report != null) {
                try {
                    LayoutLocalServiceUtil.deleteLayout(LayoutLocalServiceUtil
                            .getLayout(report.getReportPlid()), true,
                            new ServiceContext());
                    report.setReportPlid(0);
                    report.setActive(false);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    private Map<Long, Report> createThemenList(JSONArray json,
            ThemeDisplay themeDisplay) {
        Map<Long, Report> list = new HashMap<Long, Report>();
        for (int i = 0; i < json.length(); i++) {
            JSONObject jsonObject = json.getJSONObject(i);
            Report report = new Report(jsonObject.getLong("id"),
                    jsonObject.getString("titel"), jsonObject.getLong("count"),
                    jsonObject.getString("datum"),
                    jsonObject.getInt("status") == 1);
            report = addLiferayReportPage(report, themeDisplay);
            list.put(report.getId(), report);
        }
        return list;
    }

    @SuppressWarnings("finally")
    private Report addLiferayReportPage(Report report, ThemeDisplay themeDisplay) {
        long id = themeDisplay.getLayout().getGroupId();
        try {
            Layout reportpage = LayoutLocalServiceUtil.getFriendlyURLLayout(id,
                    false, "/reports/" + report.getId());
            if (reportpage != null) {
                report.setActive(true);
                report.setReportPlid(reportpage.getPlid());
            }
        } catch (NoSuchLayoutException e) {
            return report;
        } catch (PortalException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SystemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            return report;
        }

    }

}
