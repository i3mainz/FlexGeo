package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;

import java.util.List;

/**
 * The persistence utility for the o g c service layer service. This utility wraps {@link OGCServiceLayerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayerPersistence
 * @see OGCServiceLayerPersistenceImpl
 * @generated
 */
public class OGCServiceLayerUtil {
    private static OGCServiceLayerPersistence _persistence;

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
    public static void clearCache(OGCServiceLayer ogcServiceLayer) {
        getPersistence().clearCache(ogcServiceLayer);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<OGCServiceLayer> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<OGCServiceLayer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<OGCServiceLayer> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static OGCServiceLayer update(OGCServiceLayer ogcServiceLayer,
        boolean merge) throws SystemException {
        return getPersistence().update(ogcServiceLayer, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static OGCServiceLayer update(OGCServiceLayer ogcServiceLayer,
        boolean merge, ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(ogcServiceLayer, merge, serviceContext);
    }

    /**
    * Caches the o g c service layer in the entity cache if it is enabled.
    *
    * @param ogcServiceLayer the o g c service layer
    */
    public static void cacheResult(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer) {
        getPersistence().cacheResult(ogcServiceLayer);
    }

    /**
    * Caches the o g c service layers in the entity cache if it is enabled.
    *
    * @param ogcServiceLayers the o g c service layers
    */
    public static void cacheResult(
        java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> ogcServiceLayers) {
        getPersistence().cacheResult(ogcServiceLayers);
    }

    /**
    * Creates a new o g c service layer with the primary key. Does not add the o g c service layer to the database.
    *
    * @param layerId the primary key for the new o g c service layer
    * @return the new o g c service layer
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer create(
        long layerId) {
        return getPersistence().create(layerId);
    }

    /**
    * Removes the o g c service layer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer that was removed
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer remove(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().remove(layerId);
    }

    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer updateImpl(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ogcServiceLayer, merge);
    }

    /**
    * Returns the o g c service layer with the primary key or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException} if it could not be found.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByPrimaryKey(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().findByPrimaryKey(layerId);
    }

    /**
    * Returns the o g c service layer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param layerId the primary key of the o g c service layer
    * @return the o g c service layer, or <code>null</code> if a o g c service layer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByPrimaryKey(
        long layerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(layerId);
    }

    /**
    * Returns all the o g c service layers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the o g c service layers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the o g c service layers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last o g c service layer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByUuid_PrevAndNext(
        long layerId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence()
                   .findByUuid_PrevAndNext(layerId, uuid, orderByComparator);
    }

    /**
    * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Returns all the o g c service layers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the o g c service layers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the o g c service layers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer
    * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByGroupId_PrevAndNext(
        long layerId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(layerId, groupId,
            orderByComparator);
    }

    /**
    * Returns all the o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @return the matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByG_lN(
        long groupId, java.lang.String layerName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_lN(groupId, layerName);
    }

    /**
    * Returns a range of all the o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @return the range of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByG_lN(
        long groupId, java.lang.String layerName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_lN(groupId, layerName, start, end);
    }

    /**
    * Returns an ordered range of all the o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
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
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findByG_lN(
        long groupId, java.lang.String layerName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_lN(groupId, layerName, start, end, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByG_lN_First(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence()
                   .findByG_lN_First(groupId, layerName, orderByComparator);
    }

    /**
    * Returns the first o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByG_lN_First(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_lN_First(groupId, layerName, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer findByG_lN_Last(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence()
                   .findByG_lN_Last(groupId, layerName, orderByComparator);
    }

    /**
    * Returns the last o g c service layer in the ordered set where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer fetchByG_lN_Last(
        long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_lN_Last(groupId, layerName, orderByComparator);
    }

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
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer[] findByG_lN_PrevAndNext(
        long layerId, long groupId, java.lang.String layerName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence()
                   .findByG_lN_PrevAndNext(layerId, groupId, layerName,
            orderByComparator);
    }

    /**
    * Returns all the o g c service layers.
    *
    * @return the o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the o g c service layers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of o g c service layers
    * @param end the upper bound of the range of o g c service layers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the o g c service layers where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Removes the o g c service layer where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the o g c service layer that was removed
    * @throws SystemException if a system exception occurred
    */
    public static de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Removes all the o g c service layers where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Removes all the o g c service layers where groupId = &#63; and layerName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_lN(long groupId, java.lang.String layerName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_lN(groupId, layerName);
    }

    /**
    * Removes all the o g c service layers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of o g c service layers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the number of o g c service layers where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of o g c service layers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of o g c service layers where groupId = &#63; and layerName = &#63;.
    *
    * @param groupId the group ID
    * @param layerName the layer name
    * @return the number of matching o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_lN(long groupId, java.lang.String layerName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_lN(groupId, layerName);
    }

    /**
    * Returns the number of o g c service layers.
    *
    * @return the number of o g c service layers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static OGCServiceLayerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (OGCServiceLayerPersistence) PortletBeanLocatorUtil.locate(de.i3mainz.flexgeo.portal.liferay.services.service.ClpSerializer.getServletContextName(),
                    OGCServiceLayerPersistence.class.getName());

            ReferenceRegistry.registerReference(OGCServiceLayerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(OGCServiceLayerPersistence persistence) {
    }
}
