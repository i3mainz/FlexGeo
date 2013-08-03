package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OGCServiceService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       OGCServiceService
 * @generated
 */
public class OGCServiceServiceWrapper implements OGCServiceService,
    ServiceWrapper<OGCServiceService> {
    private OGCServiceService _ogcServiceService;

    public OGCServiceServiceWrapper(OGCServiceService ogcServiceService) {
        _ogcServiceService = ogcServiceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public OGCServiceService getWrappedOGCServiceService() {
        return _ogcServiceService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedOGCServiceService(OGCServiceService ogcServiceService) {
        _ogcServiceService = ogcServiceService;
    }

    public OGCServiceService getWrappedService() {
        return _ogcServiceService;
    }

    public void setWrappedService(OGCServiceService ogcServiceService) {
        _ogcServiceService = ogcServiceService;
    }
}
