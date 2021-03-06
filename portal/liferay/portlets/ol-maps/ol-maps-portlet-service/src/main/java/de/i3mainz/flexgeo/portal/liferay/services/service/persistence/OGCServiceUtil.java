package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;

import java.util.List;

/**
 * The persistence utility for the o g c service service. This utility wraps {@link OGCServicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServicePersistence
 * @see OGCServicePersistenceImpl
 * @generated
 */
public class OGCServiceUtil {
    private static OGCServicePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(OGCService ogcService) {
        getPersistence().clearCache(ogcService);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<OGCService> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<OGCService> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<OGCService> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static OGCService update(OGCService ogcService)
        throws SystemException {
        return getPersistence().update(ogcService);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static OGCService update(OGCService ogcService,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(ogcService, serviceContext);
    }

    /**
    * Returns all the o g c services where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the o g c services where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the o g c services where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByUuid_PrevAndNext(
        long serviceId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByUuid_PrevAndNext(serviceId, uuid, orderByComparator);
    }

    /**
    * Removes all the o g c services where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of o g c services where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the o g c service where uuid = &#63; and groupId = &#63; or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the o g c service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the o g c service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the o g c service where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the o g c service that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of o g c services where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the o g c services where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the o g c services where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the o g c services where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the o g c services before and after the current o g c service in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param serviceId the primary key of the current o g c service
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByUuid_C_PrevAndNext(
        long serviceId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(serviceId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the o g c services where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of o g c services where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the o g c services where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the o g c services where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the o g c services where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByGroupId_PrevAndNext(
        long serviceId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(serviceId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the o g c services where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of o g c services where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns all the o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @return the matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByG_ST(
        long groupId, java.lang.String serviceType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_ST(groupId, serviceType);
    }

    /**
    * Returns a range of all the o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @return the range of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByG_ST(
        long groupId, java.lang.String serviceType, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_ST(groupId, serviceType, start, end);
    }

    /**
    * Returns an ordered range of all the o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findByG_ST(
        long groupId, java.lang.String serviceType, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_ST(groupId, serviceType, start, end,
            orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByG_ST_First(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByG_ST_First(groupId, serviceType, orderByComparator);
    }

    /**
    * Returns the first o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByG_ST_First(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_ST_First(groupId, serviceType, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByG_ST_Last(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByG_ST_Last(groupId, serviceType, orderByComparator);
    }

    /**
    * Returns the last o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByG_ST_Last(
        long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_ST_Last(groupId, serviceType, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService[] findByG_ST_PrevAndNext(
        long serviceId, long groupId, java.lang.String serviceType,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence()
                   .findByG_ST_PrevAndNext(serviceId, groupId, serviceType,
            orderByComparator);
    }

    /**
    * Removes all the o g c services where groupId = &#63; and serviceType = &#63; from the database.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_ST(long groupId, java.lang.String serviceType)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_ST(groupId, serviceType);
    }

    /**
    * Returns the number of o g c services where groupId = &#63; and serviceType = &#63;.
    *
    * @param groupId the group ID
    * @param serviceType the service type
    * @return the number of matching o g c services
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_ST(long groupId, java.lang.String serviceType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_ST(groupId, serviceType);
    }

    /**
    * Caches the o g c service in the entity cache if it is enabled.
    *
    * @param ogcService the o g c service
    */
    public static void cacheResult(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService) {
        getPersistence().cacheResult(ogcService);
    }

    /**
    * Caches the o g c services in the entity cache if it is enabled.
    *
    * @param ogcServices the o g c services
    */
    public static void cacheResult(
        java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> ogcServices) {
        getPersistence().cacheResult(ogcServices);
    }

    /**
    * Creates a new o g c service with the primary key. Does not add the o g c service to the database.
    *
    * @param serviceId the primary key for the new o g c service
    * @return the new o g c service
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService create(
        long serviceId) {
        return getPersistence().create(serviceId);
    }

    /**
    * Removes the o g c service with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service that was removed
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService remove(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().remove(serviceId);
    }

    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService updateImpl(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ogcService);
    }

    /**
    * Returns the o g c service with the primary key or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException} if it could not be found.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService findByPrimaryKey(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException {
        return getPersistence().findByPrimaryKey(serviceId);
    }

    /**
    * Returns the o g c service with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param serviceId the primary key of the o g c service
    * @return the o g c service, or <code>null</code> if a o g c service with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCService fetchByPrimaryKey(
        long serviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(serviceId);
    }

    /**
    * Returns all the o g c services.
    *
    * @return the o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the o g c services.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of o g c services
    * @param end the upper bound of the range of o g c services (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of o g c services
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCService> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the o g c services from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of o g c services.
    *
    * @return the number of o g c services
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static OGCServicePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (OGCServicePersistence) PortletBeanLocatorUtil.locate(de.i3mainz.flexgeo.portal.liferay.services.service.ClpSerializer.getServletContextName(),
                    OGCServicePersistence.class.getName());

            ReferenceRegistry.registerReference(OGCServiceUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(OGCServicePersistence persistence) {
    }
}
