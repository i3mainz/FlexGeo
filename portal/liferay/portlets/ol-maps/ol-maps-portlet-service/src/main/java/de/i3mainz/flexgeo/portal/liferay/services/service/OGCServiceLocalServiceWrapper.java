package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OGCServiceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLocalService
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
    @Override
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
    @Override
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
    @Override
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
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService deleteOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.deleteOGCService(ogcService);
    }

    @Override
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
    @Override
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
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
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCService(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.fetchOGCService(serviceId);
    }

    /**
    * Returns the o g c service with the matching UUID and company.
    *
    * @param uuid the o g c service's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCServiceByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.fetchOGCServiceByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the o g c service matching the UUID and group.
    *
    * @param uuid the o g c service's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCServiceByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.fetchOGCServiceByUuidAndGroupId(uuid,
            groupId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the o g c service with the matching UUID and company.
    *
    * @param uuid the o g c service's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service
    * @throws PortalException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService getOGCServiceByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.getOGCServiceByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the o g c service matching the UUID and group.
    *
    * @param uuid the o g c service's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service
    * @throws PortalException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of o g c services
    * @throws SystemException if a system exception occurred
    */
    @Override
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
    @Override
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
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService updateOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.updateOGCService(ogcService);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService addOGCService(
        long userId, java.lang.String serviceName,
        java.lang.String serviceType, java.net.URL serviceURL,
        java.lang.String content, java.lang.String format,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLocalService.addOGCService(userId, serviceName,
            serviceType, serviceURL, content, format, serviceContext);
    }

    @Override
    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService,
        boolean addGroupPermissions, boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLocalService.addEntryResources(ogcService,
            addGroupPermissions, addGuestPermissions);
    }

    @Override
    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService,
        java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLocalService.addEntryResources(ogcService, groupPermissions,
            guestPermissions);
    }

    @Override
    public void addEntryResources(long entryId, boolean addGroupPermissions,
        boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLocalService.addEntryResources(entryId, addGroupPermissions,
            addGuestPermissions);
    }

    @Override
    public void addEntryResources(long entryId,
        java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLocalService.addEntryResources(entryId, groupPermissions,
            guestPermissions);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public OGCServiceLocalService getWrappedOGCServiceLocalService() {
        return _ogcServiceLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedOGCServiceLocalService(
        OGCServiceLocalService ogcServiceLocalService) {
        _ogcServiceLocalService = ogcServiceLocalService;
    }

    @Override
    public OGCServiceLocalService getWrappedService() {
        return _ogcServiceLocalService;
    }

    @Override
    public void setWrappedService(OGCServiceLocalService ogcServiceLocalService) {
        _ogcServiceLocalService = ogcServiceLocalService;
    }
}
