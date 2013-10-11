package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for OGCServiceLayer. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayerLocalServiceUtil
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceLayerLocalServiceBaseImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceLayerLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface OGCServiceLayerLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link OGCServiceLayerLocalServiceUtil} to access the o g c service layer local service. Add custom service methods to {@link de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceLayerLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the o g c service layer to the database. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @return the o g c service layer that was added
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer addOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new o g c service layer with the primary key. Does not add the o g c service layer to the database.
    *
    * @param layerId the primary key for the new o g c service layer
    * @return the new o g c service layer
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer createOGCServiceLayer(
        long layerId);

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
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the o g c service layer from the database. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @return the o g c service layer that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer deleteOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
        throws com.liferay.portal.kernel.exception.SystemException;

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
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer with the matching UUID and company.
    *
    * @param uuid the o g c service layer's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer matching the UUID and group.
    *
    * @param uuid the o g c service layer's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchOGCServiceLayerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer with the primary key.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer
    * @throws PortalException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayer(
        long layerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer with the matching UUID and company.
    *
    * @param uuid the o g c service layer's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service layer
    * @throws PortalException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer matching the UUID and group.
    *
    * @param uuid the o g c service layer's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service layer
    * @throws PortalException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer getOGCServiceLayerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> getOGCServiceLayers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c service layers.
    *
    * @return the number of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getOGCServiceLayersCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the o g c service layer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ogcServiceLayer the o g c service layer
    * @return the o g c service layer that was updated
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer updateOGCServiceLayer(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer addLayer(
        long userId, java.lang.String layerName, long layerServiceId,
        java.lang.String layerOptions, java.lang.String layerDisplayOptions,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer layer,
        boolean addGroupPermissions, boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer layer,
        java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addEntryResources(long entryId, boolean addGroupPermissions,
        boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addEntryResources(long entryId,
        java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
