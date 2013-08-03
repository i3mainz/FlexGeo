package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;

/**
 * The persistence interface for the o g c service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServicePersistenceImpl
 * @see OGCServiceUtil
 * @generated
 */
public interface OGCServicePersistence extends BasePersistence<OGCService> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link OGCServiceUtil} to access the o g c service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the o g c service in the entity cache if it is enabled.
    *
    * @param ogcService the o g c service
    */
    public void cacheResult(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService);

    /**
    * Caches the o g c services in the entity cache if it is enabled.
    *
    * @param ogcServices the o g c services
    */
    public void cacheResult(
        java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> ogcServices);

    /**
    * Creates a new o g c service with the primary key. Does not add the o g c service to the database.
    *
    * @param serviceId the primary key for the new o g c service
    * @return the new o g c service
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService create(
        long serviceId);

    /**
    * Removes the o g c service with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service that was removed
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService remove(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService updateImpl(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service with the primary key or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException} if it could not be found.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByPrimaryKey(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the o g c service with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service, or <code>null</code> if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByPrimaryKey(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the o g c services where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c services where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c services where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the first o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the last o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c services before and after the current o g c service in the ordered set where uuid = &#63;.
    *
    * @param serviceId the primary key of the current o g c service
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByUuid_PrevAndNext(
        long serviceId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the o g c service where uuid = &#63; and groupId = &#63; or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the o g c service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the o g c services where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c services where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c services where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c services before and after the current o g c service in the ordered set where groupId = &#63;.
    *
    * @param serviceId the primary key of the current o g c service
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByGroupId_PrevAndNext(
        long serviceId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns all the o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByG_ST(
        long groupId, java.lang.String serviceType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByG_ST(
        long groupId, java.lang.String serviceType, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByG_ST(
        long groupId, java.lang.String serviceType, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByG_ST_First(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByG_ST_First(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByG_ST_Last(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByG_ST_Last(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c services before and after the current o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param serviceId the primary key of the current o g c service
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByG_ST_PrevAndNext(
        long serviceId, long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Returns all the o g c services.
    *
    * @return the o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c services.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of o g c services
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the o g c services where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the o g c service where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the o g c service that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCService removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;

    /**
    * Removes all the o g c services where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the o g c services where groupId = &#63; and serviceType = &#63; from the database.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_ST(long groupId, java.lang.String serviceType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the o g c services from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c services where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c services where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c services where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public int countByG_ST(long groupId, java.lang.String serviceType)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c services.
    *
    * @return the number of o g c services
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
