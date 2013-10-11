package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException;
import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;
import de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerImpl;
import de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceLayerModelImpl;
import de.i3mainz.flexgeo.portal.liferay.services.service.persistence.OGCServiceLayerPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the o g c service layer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayerPersistence
 * @see OGCServiceLayerUtil
 * @generated
 */
public class OGCServiceLayerPersistenceImpl extends BasePersistenceImpl<OGCServiceLayer>
    implements OGCServiceLayerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link OGCServiceLayerUtil} to access the o g c service layer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = OGCServiceLayerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            OGCServiceLayerModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "ogcServiceLayer.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "ogcServiceLayer.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(ogcServiceLayer.uuid IS NULL OR ogcServiceLayer.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            OGCServiceLayerModelImpl.UUID_COLUMN_BITMASK |
            OGCServiceLayerModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "ogcServiceLayer.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "ogcServiceLayer.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(ogcServiceLayer.uuid IS NULL OR ogcServiceLayer.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "ogcServiceLayer.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            OGCServiceLayerModelImpl.UUID_COLUMN_BITMASK |
            OGCServiceLayerModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "ogcServiceLayer.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "ogcServiceLayer.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(ogcServiceLayer.uuid IS NULL OR ogcServiceLayer.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "ogcServiceLayer.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            OGCServiceLayerModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "ogcServiceLayer.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LN = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByG_lN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED,
            OGCServiceLayerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_lN",
            new String[] { Long.class.getName(), String.class.getName() },
            OGCServiceLayerModelImpl.GROUPID_COLUMN_BITMASK |
            OGCServiceLayerModelImpl.LAYERNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_LN = new FinderPath(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_lN",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_G_LN_GROUPID_2 = "ogcServiceLayer.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_LN_LAYERNAME_1 = "ogcServiceLayer.layerName IS NULL";
    private static final String _FINDER_COLUMN_G_LN_LAYERNAME_2 = "ogcServiceLayer.layerName = ?";
    private static final String _FINDER_COLUMN_G_LN_LAYERNAME_3 = "(ogcServiceLayer.layerName IS NULL OR ogcServiceLayer.layerName = '')";
    private static final String _SQL_SELECT_OGCSERVICELAYER = "SELECT ogcServiceLayer FROM OGCServiceLayer ogcServiceLayer";
    private static final String _SQL_SELECT_OGCSERVICELAYER_WHERE = "SELECT ogcServiceLayer FROM OGCServiceLayer ogcServiceLayer WHERE ";
    private static final String _SQL_COUNT_OGCSERVICELAYER = "SELECT COUNT(ogcServiceLayer) FROM OGCServiceLayer ogcServiceLayer";
    private static final String _SQL_COUNT_OGCSERVICELAYER_WHERE = "SELECT COUNT(ogcServiceLayer) FROM OGCServiceLayer ogcServiceLayer WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "ogcServiceLayer.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OGCServiceLayer exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OGCServiceLayer exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(OGCServiceLayerPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static OGCServiceLayer _nullOGCServiceLayer = new OGCServiceLayerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<OGCServiceLayer> toCacheModel() {
                return _nullOGCServiceLayerCacheModel;
            }
        };

    private static CacheModel<OGCServiceLayer> _nullOGCServiceLayerCacheModel = new CacheModel<OGCServiceLayer>() {
            @Override
            public OGCServiceLayer toEntityModel() {
                return _nullOGCServiceLayer;
            }
        };

    public OGCServiceLayerPersistenceImpl() {
        setModelClass(OGCServiceLayer.class);
    }

    /**
     * Returns all the o g c service layers where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCServiceLayer> findByUuid(String uuid)
        throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<OGCServiceLayer> list = (List<OGCServiceLayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCServiceLayer ogcServiceLayer : list) {
                if (!Validator.equals(uuid, ogcServiceLayer.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCServiceLayer>(list);
                } else {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public OGCServiceLayer findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByUuid_First(uuid,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
    }

    /**
     * Returns the first o g c service layer in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCServiceLayer> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCServiceLayer findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByUuid_Last(uuid,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
    }

    /**
     * Returns the last o g c service layer in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<OGCServiceLayer> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCServiceLayer[] findByUuid_PrevAndNext(long layerId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = findByPrimaryKey(layerId);

        Session session = null;

        try {
            session = openSession();

            OGCServiceLayer[] array = new OGCServiceLayerImpl[3];

            array[0] = getByUuid_PrevAndNext(session, ogcServiceLayer, uuid,
                    orderByComparator, true);

            array[1] = ogcServiceLayer;

            array[2] = getByUuid_PrevAndNext(session, ogcServiceLayer, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCServiceLayer getByUuid_PrevAndNext(Session session,
        OGCServiceLayer ogcServiceLayer, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ogcServiceLayer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCServiceLayer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c service layers where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (OGCServiceLayer ogcServiceLayer : findByUuid(uuid,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ogcServiceLayer);
        }
    }

    /**
     * Returns the number of o g c service layers where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_OGCSERVICELAYER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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
    @Override
    public OGCServiceLayer findByUUID_G(String uuid, long groupId)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByUUID_G(uuid, groupId);

        if (ogcServiceLayer == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchOGCServiceLayerException(msg.toString());
        }

        return ogcServiceLayer;
    }

    /**
     * Returns the o g c service layer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
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
    @Override
    public OGCServiceLayer fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof OGCServiceLayer) {
            OGCServiceLayer ogcServiceLayer = (OGCServiceLayer) result;

            if (!Validator.equals(uuid, ogcServiceLayer.getUuid()) ||
                    (groupId != ogcServiceLayer.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<OGCServiceLayer> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    OGCServiceLayer ogcServiceLayer = list.get(0);

                    result = ogcServiceLayer;

                    cacheResult(ogcServiceLayer);

                    if ((ogcServiceLayer.getUuid() == null) ||
                            !ogcServiceLayer.getUuid().equals(uuid) ||
                            (ogcServiceLayer.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, ogcServiceLayer);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (OGCServiceLayer) result;
        }
    }

    /**
     * Removes the o g c service layer where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the o g c service layer that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer removeByUUID_G(String uuid, long groupId)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = findByUUID_G(uuid, groupId);

        return remove(ogcServiceLayer);
    }

    /**
     * Returns the number of o g c service layers where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_OGCSERVICELAYER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the o g c service layers where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCServiceLayer> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<OGCServiceLayer> list = (List<OGCServiceLayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCServiceLayer ogcServiceLayer : list) {
                if (!Validator.equals(uuid, ogcServiceLayer.getUuid()) ||
                        (companyId != ogcServiceLayer.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCServiceLayer>(list);
                } else {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

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
    @Override
    public OGCServiceLayer findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
    }

    /**
     * Returns the first o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCServiceLayer> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public OGCServiceLayer findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
    }

    /**
     * Returns the last o g c service layer in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<OGCServiceLayer> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public OGCServiceLayer[] findByUuid_C_PrevAndNext(long layerId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = findByPrimaryKey(layerId);

        Session session = null;

        try {
            session = openSession();

            OGCServiceLayer[] array = new OGCServiceLayerImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, ogcServiceLayer, uuid,
                    companyId, orderByComparator, true);

            array[1] = ogcServiceLayer;

            array[2] = getByUuid_C_PrevAndNext(session, ogcServiceLayer, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCServiceLayer getByUuid_C_PrevAndNext(Session session,
        OGCServiceLayer ogcServiceLayer, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ogcServiceLayer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCServiceLayer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c service layers where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (OGCServiceLayer ogcServiceLayer : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ogcServiceLayer);
        }
    }

    /**
     * Returns the number of o g c service layers where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_OGCSERVICELAYER_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the o g c service layers where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCServiceLayer> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByGroupId(long groupId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<OGCServiceLayer> list = (List<OGCServiceLayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCServiceLayer ogcServiceLayer : list) {
                if ((groupId != ogcServiceLayer.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCServiceLayer>(list);
                } else {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public OGCServiceLayer findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByGroupId_First(groupId,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
    }

    /**
     * Returns the first o g c service layer in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCServiceLayer> list = findByGroupId(groupId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCServiceLayer findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
    }

    /**
     * Returns the last o g c service layer in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching o g c service layer, or <code>null</code> if a matching o g c service layer could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<OGCServiceLayer> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCServiceLayer[] findByGroupId_PrevAndNext(long layerId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = findByPrimaryKey(layerId);

        Session session = null;

        try {
            session = openSession();

            OGCServiceLayer[] array = new OGCServiceLayerImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, ogcServiceLayer,
                    groupId, orderByComparator, true);

            array[1] = ogcServiceLayer;

            array[2] = getByGroupId_PrevAndNext(session, ogcServiceLayer,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCServiceLayer getByGroupId_PrevAndNext(Session session,
        OGCServiceLayer ogcServiceLayer, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ogcServiceLayer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCServiceLayer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c service layers where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (OGCServiceLayer ogcServiceLayer : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ogcServiceLayer);
        }
    }

    /**
     * Returns the number of o g c service layers where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_OGCSERVICELAYER_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the o g c service layers where groupId = &#63; and layerName = &#63;.
     *
     * @param groupId the group ID
     * @param layerName the layer name
     * @return the matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCServiceLayer> findByG_lN(long groupId, String layerName)
        throws SystemException {
        return findByG_lN(groupId, layerName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByG_lN(long groupId, String layerName,
        int start, int end) throws SystemException {
        return findByG_lN(groupId, layerName, start, end, null);
    }

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
    @Override
    public List<OGCServiceLayer> findByG_lN(long groupId, String layerName,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN;
            finderArgs = new Object[] { groupId, layerName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LN;
            finderArgs = new Object[] {
                    groupId, layerName,
                    
                    start, end, orderByComparator
                };
        }

        List<OGCServiceLayer> list = (List<OGCServiceLayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCServiceLayer ogcServiceLayer : list) {
                if ((groupId != ogcServiceLayer.getGroupId()) ||
                        !Validator.equals(layerName,
                            ogcServiceLayer.getLayerName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

            query.append(_FINDER_COLUMN_G_LN_GROUPID_2);

            boolean bindLayerName = false;

            if (layerName == null) {
                query.append(_FINDER_COLUMN_G_LN_LAYERNAME_1);
            } else if (layerName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_LN_LAYERNAME_3);
            } else {
                bindLayerName = true;

                query.append(_FINDER_COLUMN_G_LN_LAYERNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindLayerName) {
                    qPos.add(layerName);
                }

                if (!pagination) {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCServiceLayer>(list);
                } else {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public OGCServiceLayer findByG_lN_First(long groupId, String layerName,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByG_lN_First(groupId, layerName,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", layerName=");
        msg.append(layerName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
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
    @Override
    public OGCServiceLayer fetchByG_lN_First(long groupId, String layerName,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCServiceLayer> list = findByG_lN(groupId, layerName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCServiceLayer findByG_lN_Last(long groupId, String layerName,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByG_lN_Last(groupId, layerName,
                orderByComparator);

        if (ogcServiceLayer != null) {
            return ogcServiceLayer;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", layerName=");
        msg.append(layerName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceLayerException(msg.toString());
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
    @Override
    public OGCServiceLayer fetchByG_lN_Last(long groupId, String layerName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_lN(groupId, layerName);

        if (count == 0) {
            return null;
        }

        List<OGCServiceLayer> list = findByG_lN(groupId, layerName, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCServiceLayer[] findByG_lN_PrevAndNext(long layerId, long groupId,
        String layerName, OrderByComparator orderByComparator)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = findByPrimaryKey(layerId);

        Session session = null;

        try {
            session = openSession();

            OGCServiceLayer[] array = new OGCServiceLayerImpl[3];

            array[0] = getByG_lN_PrevAndNext(session, ogcServiceLayer, groupId,
                    layerName, orderByComparator, true);

            array[1] = ogcServiceLayer;

            array[2] = getByG_lN_PrevAndNext(session, ogcServiceLayer, groupId,
                    layerName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCServiceLayer getByG_lN_PrevAndNext(Session session,
        OGCServiceLayer ogcServiceLayer, long groupId, String layerName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICELAYER_WHERE);

        query.append(_FINDER_COLUMN_G_LN_GROUPID_2);

        boolean bindLayerName = false;

        if (layerName == null) {
            query.append(_FINDER_COLUMN_G_LN_LAYERNAME_1);
        } else if (layerName.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_G_LN_LAYERNAME_3);
        } else {
            bindLayerName = true;

            query.append(_FINDER_COLUMN_G_LN_LAYERNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindLayerName) {
            qPos.add(layerName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ogcServiceLayer);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCServiceLayer> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c service layers where groupId = &#63; and layerName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param layerName the layer name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_lN(long groupId, String layerName)
        throws SystemException {
        for (OGCServiceLayer ogcServiceLayer : findByG_lN(groupId, layerName,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ogcServiceLayer);
        }
    }

    /**
     * Returns the number of o g c service layers where groupId = &#63; and layerName = &#63;.
     *
     * @param groupId the group ID
     * @param layerName the layer name
     * @return the number of matching o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_lN(long groupId, String layerName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_LN;

        Object[] finderArgs = new Object[] { groupId, layerName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_OGCSERVICELAYER_WHERE);

            query.append(_FINDER_COLUMN_G_LN_GROUPID_2);

            boolean bindLayerName = false;

            if (layerName == null) {
                query.append(_FINDER_COLUMN_G_LN_LAYERNAME_1);
            } else if (layerName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_LN_LAYERNAME_3);
            } else {
                bindLayerName = true;

                query.append(_FINDER_COLUMN_G_LN_LAYERNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindLayerName) {
                    qPos.add(layerName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the o g c service layer in the entity cache if it is enabled.
     *
     * @param ogcServiceLayer the o g c service layer
     */
    @Override
    public void cacheResult(OGCServiceLayer ogcServiceLayer) {
        EntityCacheUtil.putResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerImpl.class, ogcServiceLayer.getPrimaryKey(),
            ogcServiceLayer);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { ogcServiceLayer.getUuid(), ogcServiceLayer.getGroupId() },
            ogcServiceLayer);

        ogcServiceLayer.resetOriginalValues();
    }

    /**
     * Caches the o g c service layers in the entity cache if it is enabled.
     *
     * @param ogcServiceLayers the o g c service layers
     */
    @Override
    public void cacheResult(List<OGCServiceLayer> ogcServiceLayers) {
        for (OGCServiceLayer ogcServiceLayer : ogcServiceLayers) {
            if (EntityCacheUtil.getResult(
                        OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
                        OGCServiceLayerImpl.class,
                        ogcServiceLayer.getPrimaryKey()) == null) {
                cacheResult(ogcServiceLayer);
            } else {
                ogcServiceLayer.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all o g c service layers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(OGCServiceLayerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(OGCServiceLayerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the o g c service layer.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(OGCServiceLayer ogcServiceLayer) {
        EntityCacheUtil.removeResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerImpl.class, ogcServiceLayer.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(ogcServiceLayer);
    }

    @Override
    public void clearCache(List<OGCServiceLayer> ogcServiceLayers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (OGCServiceLayer ogcServiceLayer : ogcServiceLayers) {
            EntityCacheUtil.removeResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
                OGCServiceLayerImpl.class, ogcServiceLayer.getPrimaryKey());

            clearUniqueFindersCache(ogcServiceLayer);
        }
    }

    protected void cacheUniqueFindersCache(OGCServiceLayer ogcServiceLayer) {
        if (ogcServiceLayer.isNew()) {
            Object[] args = new Object[] {
                    ogcServiceLayer.getUuid(), ogcServiceLayer.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                ogcServiceLayer);
        } else {
            OGCServiceLayerModelImpl ogcServiceLayerModelImpl = (OGCServiceLayerModelImpl) ogcServiceLayer;

            if ((ogcServiceLayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceLayer.getUuid(), ogcServiceLayer.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    ogcServiceLayer);
            }
        }
    }

    protected void clearUniqueFindersCache(OGCServiceLayer ogcServiceLayer) {
        OGCServiceLayerModelImpl ogcServiceLayerModelImpl = (OGCServiceLayerModelImpl) ogcServiceLayer;

        Object[] args = new Object[] {
                ogcServiceLayer.getUuid(), ogcServiceLayer.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((ogcServiceLayerModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    ogcServiceLayerModelImpl.getOriginalUuid(),
                    ogcServiceLayerModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new o g c service layer with the primary key. Does not add the o g c service layer to the database.
     *
     * @param layerId the primary key for the new o g c service layer
     * @return the new o g c service layer
     */
    @Override
    public OGCServiceLayer create(long layerId) {
        OGCServiceLayer ogcServiceLayer = new OGCServiceLayerImpl();

        ogcServiceLayer.setNew(true);
        ogcServiceLayer.setPrimaryKey(layerId);

        String uuid = PortalUUIDUtil.generate();

        ogcServiceLayer.setUuid(uuid);

        return ogcServiceLayer;
    }

    /**
     * Removes the o g c service layer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param layerId the primary key of the o g c service layer
     * @return the o g c service layer that was removed
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer remove(long layerId)
        throws NoSuchOGCServiceLayerException, SystemException {
        return remove((Serializable) layerId);
    }

    /**
     * Removes the o g c service layer with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the o g c service layer
     * @return the o g c service layer that was removed
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer remove(Serializable primaryKey)
        throws NoSuchOGCServiceLayerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            OGCServiceLayer ogcServiceLayer = (OGCServiceLayer) session.get(OGCServiceLayerImpl.class,
                    primaryKey);

            if (ogcServiceLayer == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchOGCServiceLayerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(ogcServiceLayer);
        } catch (NoSuchOGCServiceLayerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected OGCServiceLayer removeImpl(OGCServiceLayer ogcServiceLayer)
        throws SystemException {
        ogcServiceLayer = toUnwrappedModel(ogcServiceLayer);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(ogcServiceLayer)) {
                ogcServiceLayer = (OGCServiceLayer) session.get(OGCServiceLayerImpl.class,
                        ogcServiceLayer.getPrimaryKeyObj());
            }

            if (ogcServiceLayer != null) {
                session.delete(ogcServiceLayer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (ogcServiceLayer != null) {
            clearCache(ogcServiceLayer);
        }

        return ogcServiceLayer;
    }

    @Override
    public OGCServiceLayer updateImpl(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer ogcServiceLayer)
        throws SystemException {
        ogcServiceLayer = toUnwrappedModel(ogcServiceLayer);

        boolean isNew = ogcServiceLayer.isNew();

        OGCServiceLayerModelImpl ogcServiceLayerModelImpl = (OGCServiceLayerModelImpl) ogcServiceLayer;

        if (Validator.isNull(ogcServiceLayer.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            ogcServiceLayer.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (ogcServiceLayer.isNew()) {
                session.save(ogcServiceLayer);

                ogcServiceLayer.setNew(false);
            } else {
                session.merge(ogcServiceLayer);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !OGCServiceLayerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((ogcServiceLayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceLayerModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { ogcServiceLayerModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((ogcServiceLayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceLayerModelImpl.getOriginalUuid(),
                        ogcServiceLayerModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        ogcServiceLayerModelImpl.getUuid(),
                        ogcServiceLayerModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((ogcServiceLayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceLayerModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { ogcServiceLayerModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((ogcServiceLayerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceLayerModelImpl.getOriginalGroupId(),
                        ogcServiceLayerModelImpl.getOriginalLayerName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_LN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN,
                    args);

                args = new Object[] {
                        ogcServiceLayerModelImpl.getGroupId(),
                        ogcServiceLayerModelImpl.getLayerName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_LN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN,
                    args);
            }
        }

        EntityCacheUtil.putResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceLayerImpl.class, ogcServiceLayer.getPrimaryKey(),
            ogcServiceLayer);

        clearUniqueFindersCache(ogcServiceLayer);
        cacheUniqueFindersCache(ogcServiceLayer);

        return ogcServiceLayer;
    }

    protected OGCServiceLayer toUnwrappedModel(OGCServiceLayer ogcServiceLayer) {
        if (ogcServiceLayer instanceof OGCServiceLayerImpl) {
            return ogcServiceLayer;
        }

        OGCServiceLayerImpl ogcServiceLayerImpl = new OGCServiceLayerImpl();

        ogcServiceLayerImpl.setNew(ogcServiceLayer.isNew());
        ogcServiceLayerImpl.setPrimaryKey(ogcServiceLayer.getPrimaryKey());

        ogcServiceLayerImpl.setUuid(ogcServiceLayer.getUuid());
        ogcServiceLayerImpl.setLayerId(ogcServiceLayer.getLayerId());
        ogcServiceLayerImpl.setGroupId(ogcServiceLayer.getGroupId());
        ogcServiceLayerImpl.setCompanyId(ogcServiceLayer.getCompanyId());
        ogcServiceLayerImpl.setUserId(ogcServiceLayer.getUserId());
        ogcServiceLayerImpl.setCreateDate(ogcServiceLayer.getCreateDate());
        ogcServiceLayerImpl.setModifiedDate(ogcServiceLayer.getModifiedDate());
        ogcServiceLayerImpl.setLayerName(ogcServiceLayer.getLayerName());
        ogcServiceLayerImpl.setLayerServiceId(ogcServiceLayer.getLayerServiceId());
        ogcServiceLayerImpl.setLayerOptions(ogcServiceLayer.getLayerOptions());
        ogcServiceLayerImpl.setLayerDisplayOptions(ogcServiceLayer.getLayerDisplayOptions());

        return ogcServiceLayerImpl;
    }

    /**
     * Returns the o g c service layer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the o g c service layer
     * @return the o g c service layer
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer findByPrimaryKey(Serializable primaryKey)
        throws NoSuchOGCServiceLayerException, SystemException {
        OGCServiceLayer ogcServiceLayer = fetchByPrimaryKey(primaryKey);

        if (ogcServiceLayer == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchOGCServiceLayerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return ogcServiceLayer;
    }

    /**
     * Returns the o g c service layer with the primary key or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException} if it could not be found.
     *
     * @param layerId the primary key of the o g c service layer
     * @return the o g c service layer
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceLayerException if a o g c service layer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer findByPrimaryKey(long layerId)
        throws NoSuchOGCServiceLayerException, SystemException {
        return findByPrimaryKey((Serializable) layerId);
    }

    /**
     * Returns the o g c service layer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the o g c service layer
     * @return the o g c service layer, or <code>null</code> if a o g c service layer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        OGCServiceLayer ogcServiceLayer = (OGCServiceLayer) EntityCacheUtil.getResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
                OGCServiceLayerImpl.class, primaryKey);

        if (ogcServiceLayer == _nullOGCServiceLayer) {
            return null;
        }

        if (ogcServiceLayer == null) {
            Session session = null;

            try {
                session = openSession();

                ogcServiceLayer = (OGCServiceLayer) session.get(OGCServiceLayerImpl.class,
                        primaryKey);

                if (ogcServiceLayer != null) {
                    cacheResult(ogcServiceLayer);
                } else {
                    EntityCacheUtil.putResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
                        OGCServiceLayerImpl.class, primaryKey,
                        _nullOGCServiceLayer);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(OGCServiceLayerModelImpl.ENTITY_CACHE_ENABLED,
                    OGCServiceLayerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return ogcServiceLayer;
    }

    /**
     * Returns the o g c service layer with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param layerId the primary key of the o g c service layer
     * @return the o g c service layer, or <code>null</code> if a o g c service layer with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCServiceLayer fetchByPrimaryKey(long layerId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) layerId);
    }

    /**
     * Returns all the o g c service layers.
     *
     * @return the o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCServiceLayer> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<OGCServiceLayer> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<OGCServiceLayer> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<OGCServiceLayer> list = (List<OGCServiceLayer>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_OGCSERVICELAYER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_OGCSERVICELAYER;

                if (pagination) {
                    sql = sql.concat(OGCServiceLayerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCServiceLayer>(list);
                } else {
                    list = (List<OGCServiceLayer>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the o g c service layers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (OGCServiceLayer ogcServiceLayer : findAll()) {
            remove(ogcServiceLayer);
        }
    }

    /**
     * Returns the number of o g c service layers.
     *
     * @return the number of o g c service layers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_OGCSERVICELAYER);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the o g c service layer persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<OGCServiceLayer>> listenersList = new ArrayList<ModelListener<OGCServiceLayer>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<OGCServiceLayer>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(OGCServiceLayerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
