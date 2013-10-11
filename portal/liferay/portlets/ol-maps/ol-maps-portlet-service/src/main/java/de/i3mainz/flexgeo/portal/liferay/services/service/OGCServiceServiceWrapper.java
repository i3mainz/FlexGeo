package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OGCServiceService}.
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceService
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
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public OGCServiceService getWrappedOGCServiceService() {
        return _ogcServiceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedOGCServiceService(OGCServiceService ogcServiceService) {
        _ogcServiceService = ogcServiceService;
    }

    @Override
    public OGCServiceService getWrappedService() {
        return _ogcServiceService;
    }

    @Override
    public void setWrappedService(OGCServiceService ogcServiceService) {
        _ogcServiceService = ogcServiceService;
    }
}
