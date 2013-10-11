package de.i3mainz.flexgeo.portal.liferay.services.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;

/**
 * Provides the local service interface for OGCService. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLocalServiceUtil
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceLocalServiceBaseImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface OGCServiceLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link OGCServiceLocalServiceUtil} to access the o g c service local service. Add custom service methods to {@link de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the o g c service to the database. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @return the o g c service that was added
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService addOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new o g c service with the primary key. Does not add the o g c service to the database.
    *
    * @param serviceId the primary key for the new o g c service
    * @return the new o g c service
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService createOGCService(
        long serviceId);

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
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the o g c service from the database. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @return the o g c service that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService deleteOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCService(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service with the matching UUID and company.
    *
    * @param uuid the o g c service's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCServiceByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service matching the UUID and group.
    *
    * @param uuid the o g c service's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchOGCServiceByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service with the matching UUID and company.
    *
    * @param uuid the o g c service's UUID
    * @param companyId the primary key of the company
    * @return the matching o g c service
    * @throws PortalException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService getOGCServiceByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service matching the UUID and group.
    *
    * @param uuid the o g c service's UUID
    * @param groupId the primary key of the group
    * @return the matching o g c service
    * @throws PortalException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService getOGCServiceByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> getOGCServices(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c services.
    *
    * @return the number of o g c services
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getOGCServicesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the o g c service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ogcService the o g c service
    * @return the o g c service that was updated
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService updateOGCService(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
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

    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService addOGCService(
        long userId, java.lang.String serviceName,
        java.lang.String serviceType, java.net.URL serviceURL,
        java.lang.String content, java.lang.String format,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService,
        boolean addGroupPermissions, boolean addGuestPermissions)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void addEntryResources(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService,
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
