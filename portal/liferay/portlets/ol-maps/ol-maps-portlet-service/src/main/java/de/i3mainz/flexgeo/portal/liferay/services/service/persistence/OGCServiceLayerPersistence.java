package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;

/**
 * The persistence interface for the o g c service layer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayerPersistenceImpl
 * @see OGCServiceLayerUtil
 * @generated
 */
public interface OGCServiceLayerPersistence extends BasePersistence<OGCServiceLayer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link OGCServiceLayerUtil} to access the o g c service layer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the o g c service layers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c service layers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c service layers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the first o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the last o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layers before and after the current o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param layerId the primary key of the current o g c service layer
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByUuid_PrevAndNext(
        long layerId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Removes all the o g c service layers where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c service layers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the o g c service layer where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the o g c service layer that was removed
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the number of o g c service layers where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the o g c service layers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c service layers where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c service layers where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the first o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the last o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layers before and after the current o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param layerId the primary key of the current o g c service layer
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByUuid_C_PrevAndNext(
        long layerId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Removes all the o g c service layers where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c service layers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the o g c service layers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c service layers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c service layers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layers before and after the current o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param layerId the primary key of the current o g c service layer
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByGroupId_PrevAndNext(
        long layerId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Removes all the o g c service layers where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c service layers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByG_lN(
        long groupId, java.lang.String layerName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByG_lN(
        long groupId, java.lang.String layerName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByG_lN(
        long groupId, java.lang.String layerName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByG_lN_First(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByG_lN_First(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByG_lN_Last(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByG_lN_Last(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layers before and after the current o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param layerId the primary key of the current o g c service layer
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByG_lN_PrevAndNext(
        long layerId, long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Removes all the o g c service layers where groupId = &#63; and layerName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_lN(long groupId, java.lang.String layerName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_lN(long groupId, java.lang.String layerName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the o g c service layer in the entity cache if it is enabled.
    *
    * @param ogcServiceLayer the o g c service layer
    */
    public void cacheResult(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer);

    /**
    * Caches the o g c service layers in the entity cache if it is enabled.
    *
    * @param ogcServiceLayers the o g c service layers
    */
    public void cacheResult(
        java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> ogcServiceLayers);

    /**
    * Creates a new o g c service layer with the primary key. Does not add the o g c service layer to the database.
    *
    * @param layerId the primary key for the new o g c service layer
    * @return the new o g c service layer
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer create(
        long layerId);

    /**
    * Removes the o g c service layer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer that was removed
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer remove(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer updateImpl(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the o g c service layer with the primary key or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException} if it could not be found.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByPrimaryKey(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;

    /**
    * Returns the o g c service layer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer, or <code>null</code> if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByPrimaryKey(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the o g c service layers.
    *
    * @return the o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the o g c service layers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the o g c service layers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of o g c service layers.
    *
    * @return the number of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
