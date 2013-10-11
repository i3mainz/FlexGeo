package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OGCServiceLayerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayerLocalService
 * @generated
 */
public class OGCServiceLayerLocalServiceWrapper
    implements OGCServiceLayerLocalService,
        ServiceWrapper<OGCServiceLayerLocalService> {
    private OGCServiceLayerLocalService _ogcServiceLayerLocalService;

    public OGCServiceLayerLocalServiceWrapper(
        OGCServiceLayerLocalService ogcServiceLayerLocalService) {
        _ogcServiceLayerLocalService = ogcServiceLayerLocalService;
    }

    /**
    * Adds the o g c service layer to the database. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @return the o g c service layer that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer addOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.addOGCServiceLayer(ogcServiceLayer);
    }

    /**
    * Creates a new o g c service layer with the primary key. Does not add the o g c service layer to the database.
    *
    * @param layerId the primary key for the new o g c service layer
    * @return the new o g c service layer
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer createOGCServiceLayer(
        long layerId) {
        return _ogcServiceLayerLocalService.createOGCServiceLayer(layerId);
    }

    /**
    * Deletes the o g c service layer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer that was removed
    * @throws PortalException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer deleteOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.deleteOGCServiceLayer(layerId);
    }

    /**
    * Deletes the o g c service layer from the database. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @return the o g c service layer that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer deleteOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.deleteOGCServiceLayer(ogcServiceLayer);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _ogcServiceLayerLocalService.dynamicQuery();
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
        return _ogcServiceLayerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _ogcServiceLayerLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _ogcServiceLayerLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _ogcServiceLayerLocalService.dynamicQueryCount(dynamicQuery);
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
        return _ogcServiceLayerLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.fetchOGCServiceLayer(layerId);
    }

    /**
    * Returns the o g c service layer with the matching UUID and company.
    *
    * @param uuid the o g c service layer's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.fetchOGCServiceLayerByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the o g c service layer matching the UUID and group.
    *
    * @param uuid the o g c service layer's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.fetchOGCServiceLayerByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the o g c service layer with the primary key.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer
    * @throws PortalException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getOGCServiceLayer(layerId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the o g c service layer with the matching UUID and company.
    *
    * @param uuid the o g c service layer's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service layer
    * @throws PortalException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getOGCServiceLayerByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the o g c service layer matching the UUID and group.
    *
    * @param uuid the o g c service layer's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service layer
    * @throws PortalException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getOGCServiceLayerByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns a range of all the o g c service layers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> getOGCServiceLayers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getOGCServiceLayers(start, end);
    }

    /**
    * Returns the number of o g c service layers.
    *
    * @return the number of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getOGCServiceLayersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getOGCServiceLayersCount();
    }

    /**
    * Updates the o g c service layer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @return the o g c service layer that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer updateOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.updateOGCServiceLayer(ogcServiceLayer);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceLayerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceLayerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceLayerLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer addLayer(
        long userId, java.lang.String layerName, long layerServiceId,
        java.lang.String layerOptions, java.lang.String layerDisplayOptions,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.addLayer(userId, layerName,
            layerServiceId, layerOptions, layerDisplayOptions, serviceContext);
    }

    @Override
    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer layer,
        boolean addGroupPermissions, boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLayerLocalService.addEntryResources(layer,
            addGroupPermissions, addGuestPermissions);
    }

    @Override
    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer layer,
        java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLayerLocalService.addEntryResources(layer, groupPermissions,
            guestPermissions);
    }

    @Override
    public void addEntryResources(long entryId, boolean addGroupPermissions,
        boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLayerLocalService.addEntryResources(entryId,
            addGroupPermissions, addGuestPermissions);
    }

    @Override
    public void addEntryResources(long entryId,
        java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLayerLocalService.addEntryResources(entryId,
            groupPermissions, guestPermissions);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public OGCServiceLayerLocalService getWrappedOGCServiceLayerLocalService() {
        return _ogcServiceLayerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedOGCServiceLayerLocalService(
        OGCServiceLayerLocalService ogcServiceLayerLocalService) {
        _ogcServiceLayerLocalService = ogcServiceLayerLocalService;
    }

    @Override
    public OGCServiceLayerLocalService getWrappedService() {
        return _ogcServiceLayerLocalService;
    }

    @Override
    public void setWrappedService(
        OGCServiceLayerLocalService ogcServiceLayerLocalService) {
        _ogcServiceLayerLocalService = ogcServiceLayerLocalService;
    }
}
