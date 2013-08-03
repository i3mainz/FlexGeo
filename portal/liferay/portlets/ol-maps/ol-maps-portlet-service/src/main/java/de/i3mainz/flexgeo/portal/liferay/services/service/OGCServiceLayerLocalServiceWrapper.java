package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OGCServiceLayerLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       OGCServiceLayerLocalService
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
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer deleteOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.deleteOGCServiceLayer(ogcServiceLayer);
    }

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
        return _ogcServiceLayerLocalService.dynamicQuery(dynamicQuery, start,
            end);
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.dynamicQueryCount(dynamicQuery);
    }

    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.fetchOGCServiceLayer(layerId);
    }

    /**
    * Returns the o g c service layer with the primary key.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer
    * @throws PortalException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getOGCServiceLayer(layerId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the o g c service layer with the UUID in the group.
    *
    * @param uuid the UUID of o g c service layer
    * @param groupId the group id of the o g c service layer
    * @return the o g c service layer
    * @throws PortalException if a o g c service layer with the UUID in the group could not be found
    * @throws SystemException if a system exception occurred
    */
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of o g c service layers
    * @throws SystemException if a system exception occurred
    */
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
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer updateOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.updateOGCServiceLayer(ogcServiceLayer);
    }

    /**
    * Updates the o g c service layer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @param merge whether to merge the o g c service layer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the o g c service layer that was updated
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer updateOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayerLocalService.updateOGCServiceLayer(ogcServiceLayer,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _ogcServiceLayerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ogcServiceLayerLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ogcServiceLayerLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public OGCServiceLayerLocalService getWrappedOGCServiceLayerLocalService() {
        return _ogcServiceLayerLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedOGCServiceLayerLocalService(
        OGCServiceLayerLocalService ogcServiceLayerLocalService) {
        _ogcServiceLayerLocalService = ogcServiceLayerLocalService;
    }

    public OGCServiceLayerLocalService getWrappedService() {
        return _ogcServiceLayerLocalService;
    }

    public void setWrappedService(
        OGCServiceLayerLocalService ogcServiceLayerLocalService) {
        _ogcServiceLayerLocalService = ogcServiceLayerLocalService;
    }
}
