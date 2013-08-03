package de.i3mainz.flexgeo.portal.liferay.services.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import de.i3mainz.flexgeo.portal.liferay.services.service.ClpSerializer;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalServiceUtil;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerServiceUtil;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalServiceUtil;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            OGCServiceLocalServiceUtil.clearService();

            OGCServiceServiceUtil.clearService();
            OGCServiceLayerLocalServiceUtil.clearService();

            OGCServiceLayerServiceUtil.clearService();
        }
    }
}
