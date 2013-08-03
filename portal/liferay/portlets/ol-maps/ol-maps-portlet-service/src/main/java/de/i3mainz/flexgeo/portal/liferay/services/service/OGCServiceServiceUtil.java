package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * The utility for the o g c service remote service. This utility wraps {@link de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceService
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceServiceBaseImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceServiceImpl
 * @generated
 */
public class OGCServiceServiceUtil {
    private static OGCServiceService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static OGCServiceService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    OGCServiceService.class.getName());

            if (invokableService instanceof OGCServiceService) {
                _service = (OGCServiceService) invokableService;
            } else {
                _service = new OGCServiceServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(OGCServiceServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(OGCServiceService service) {
    }
}
