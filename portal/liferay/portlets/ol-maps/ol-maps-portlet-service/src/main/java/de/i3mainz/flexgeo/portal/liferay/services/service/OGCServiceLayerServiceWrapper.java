package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OGCServiceLayerService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       OGCServiceLayerService
 * @generated
 */
public class OGCServiceLayerServiceWrapper implements OGCServiceLayerService,
    ServiceWrapper<OGCServiceLayerService> {
    private OGCServiceLayerService _ogcServiceLayerService;

    public OGCServiceLayerServiceWrapper(
        OGCServiceLayerService ogcServiceLayerService) {
        _ogcServiceLayerService = ogcServiceLayerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceLayerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceLayerService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceLayerService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public OGCServiceLayerService getWrappedOGCServiceLayerService() {
        return _ogcServiceLayerService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedOGCServiceLayerService(
        OGCServiceLayerService ogcServiceLayerService) {
        _ogcServiceLayerService = ogcServiceLayerService;
    }

    public OGCServiceLayerService getWrappedService() {
        return _ogcServiceLayerService;
    }

    public void setWrappedService(OGCServiceLayerService ogcServiceLayerService) {
        _ogcServiceLayerService = ogcServiceLayerService;
    }
}
