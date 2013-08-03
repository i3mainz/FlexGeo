package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OGCServiceLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       OGCServiceLocalService
 * @generated
 */
public class OGCServiceLocalServiceWrapper implements OGCServiceLocalService,
    ServiceWrapper<OGCServiceLocalService> {
    private OGCServiceLocalService _ogcServiceLocalService;

    public OGCServiceLocalServiceWrapper(
        OGCServiceLocalService ogcServiceLocalService) {
        _ogcServiceLocalService = ogcServiceLocalService;
    }

    /**
    * Adds the o g c service to the database. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @return the o g c service that was added
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService addOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.addOGCService(ogcService);
    }

    /**
    * Creates a new o g c service with the primary key. Does not add the o g c service to the database.
    *
    * @param serviceId the primary key for the new o g c service
    * @return the new o g c service
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService createOGCService(
        long serviceId) {
        return _ogcServiceLocalService.createOGCService(serviceId);
    }

    /**
    * Deletes the o g c service with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service that was removed
    * @throws PortalException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService deleteOGCService(
        long serviceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.deleteOGCService(serviceId);
    }

    /**
    * Deletes the o g c service from the database. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @return the o g c service that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService deleteOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.deleteOGCService(ogcService);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _ogcServiceLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.dynamicQueryCount(dynamicQuery);
    }

    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCService(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.fetchOGCService(serviceId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the o g c service with the UUID in the group.
    *
    * @param uuid the UUID of o g c service
    * @param groupId the group id of the o g c service
    * @return the o g c service
    * @throws PortalException if a o g c service with the UUID in the group could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService getOGCServiceByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.getOGCServiceByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns a range of all the o g c services.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> getOGCServices(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.getOGCServices(start, end);
    }

    /**
    * Returns the number of o g c services.
    *
    * @return the number of o g c services
    * @throws SystemException if a system exception occurred
    */
    public int getOGCServicesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.getOGCServicesCount();
    }

    /**
    * Updates the o g c service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @return the o g c service that was updated
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService updateOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.updateOGCService(ogcService);
    }

    /**
    * Updates the o g c service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @param merge whether to merge the o g c service with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the o g c service that was updated
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService updateOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.updateOGCService(ogcService, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public OGCServiceLocalService getWrappedOGCServiceLocalService() {
        return _ogcServiceLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedOGCServiceLocalService(
        OGCServiceLocalService ogcServiceLocalService) {
        _ogcServiceLocalService = ogcServiceLocalService;
    }

    public OGCServiceLocalService getWrappedService() {
        return _ogcServiceLocalService;
    }

    public void setWrappedService(OGCServiceLocalService ogcServiceLocalService) {
        _ogcServiceLocalService = ogcServiceLocalService;
    }
}
