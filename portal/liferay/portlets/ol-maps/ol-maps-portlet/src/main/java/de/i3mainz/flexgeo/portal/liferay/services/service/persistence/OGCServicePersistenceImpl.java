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

import de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException;
import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;
import de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceImpl;
import de.i3mainz.flexgeo.portal.liferay.services.model.impl.OGCServiceModelImpl;
import de.i3mainz.flexgeo.portal.liferay.services.service.persistence.OGCServicePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the o g c service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServicePersistence
 * @see OGCServiceUtil
 * @generated
 */
public class OGCServicePersistenceImpl extends BasePersistenceImpl<OGCService>
    implements OGCServicePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link OGCServiceUtil} to access the o g c service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = OGCServiceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            OGCServiceModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "ogcService.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "ogcService.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(ogcService.uuid IS NULL OR ogcService.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            OGCServiceModelImpl.UUID_COLUMN_BITMASK |
            OGCServiceModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "ogcService.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "ogcService.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(ogcService.uuid IS NULL OR ogcService.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "ogcService.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            OGCServiceModelImpl.UUID_COLUMN_BITMASK |
            OGCServiceModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "ogcService.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "ogcService.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(ogcService.uuid IS NULL OR ogcService.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "ogcService.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            OGCServiceModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "ogcService.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ST = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_ST",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ST = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, OGCServiceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_ST",
            new String[] { Long.class.getName(), String.class.getName() },
            OGCServiceModelImpl.GROUPID_COLUMN_BITMASK |
            OGCServiceModelImpl.SERVICETYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_ST = new FinderPath(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_ST",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_G_ST_GROUPID_2 = "ogcService.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_ST_SERVICETYPE_1 = "ogcService.serviceType IS NULL";
    private static final String _FINDER_COLUMN_G_ST_SERVICETYPE_2 = "ogcService.serviceType = ?";
    private static final String _FINDER_COLUMN_G_ST_SERVICETYPE_3 = "(ogcService.serviceType IS NULL OR ogcService.serviceType = '')";
    private static final String _SQL_SELECT_OGCSERVICE = "SELECT ogcService FROM OGCService ogcService";
    private static final String _SQL_SELECT_OGCSERVICE_WHERE = "SELECT ogcService FROM OGCService ogcService WHERE ";
    private static final String _SQL_COUNT_OGCSERVICE = "SELECT COUNT(ogcService) FROM OGCService ogcService";
    private static final String _SQL_COUNT_OGCSERVICE_WHERE = "SELECT COUNT(ogcService) FROM OGCService ogcService WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "ogcService.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OGCService exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No OGCService exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(OGCServicePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static OGCService _nullOGCService = new OGCServiceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<OGCService> toCacheModel() {
                return _nullOGCServiceCacheModel;
            }
        };

    private static CacheModel<OGCService> _nullOGCServiceCacheModel = new CacheModel<OGCService>() {
            @Override
            public OGCService toEntityModel() {
                return _nullOGCService;
            }
        };

    public OGCServicePersistenceImpl() {
        setModelClass(OGCService.class);
    }

    /**
     * Returns all the o g c services where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching o g c services
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCService> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<OGCService> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<OGCService> findByUuid(String uuid, int start, int end,
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

        List<OGCService> list = (List<OGCService>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCService ogcService : list) {
                if (!Validator.equals(uuid, ogcService.getUuid())) {
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

            query.append(_SQL_SELECT_OGCSERVICE_WHERE);

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
                query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
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
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCService>(list);
                } else {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first o g c service in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByUuid_First(uuid, orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
    }

    /**
     * Returns the first o g c service in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCService> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByUuid_Last(uuid, orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
    }

    /**
     * Returns the last o g c service in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<OGCService> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService[] findByUuid_PrevAndNext(long serviceId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = findByPrimaryKey(serviceId);

        Session session = null;

        try {
            session = openSession();

            OGCService[] array = new OGCServiceImpl[3];

            array[0] = getByUuid_PrevAndNext(session, ogcService, uuid,
                    orderByComparator, true);

            array[1] = ogcService;

            array[2] = getByUuid_PrevAndNext(session, ogcService, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCService getByUuid_PrevAndNext(Session session,
        OGCService ogcService, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICE_WHERE);

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
            query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(ogcService);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCService> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c services where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (OGCService ogcService : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(ogcService);
        }
    }

    /**
     * Returns the number of o g c services where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching o g c services
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

            query.append(_SQL_COUNT_OGCSERVICE_WHERE);

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
     * Returns the o g c service where uuid = &#63; and groupId = &#63; or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByUUID_G(String uuid, long groupId)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByUUID_G(uuid, groupId);

        if (ogcService == null) {
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

            throw new NoSuchOGCServiceException(msg.toString());
        }

        return ogcService;
    }

    /**
     * Returns the o g c service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching o g c service, or <code>null</code> if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
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
    @Override
    public OGCService fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof OGCService) {
            OGCService ogcService = (OGCService) result;

            if (!Validator.equals(uuid, ogcService.getUuid()) ||
                    (groupId != ogcService.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_OGCSERVICE_WHERE);

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

                List<OGCService> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    OGCService ogcService = list.get(0);

                    result = ogcService;

                    cacheResult(ogcService);

                    if ((ogcService.getUuid() == null) ||
                            !ogcService.getUuid().equals(uuid) ||
                            (ogcService.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, ogcService);
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
            return (OGCService) result;
        }
    }

    /**
     * Removes the o g c service where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the o g c service that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService removeByUUID_G(String uuid, long groupId)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = findByUUID_G(uuid, groupId);

        return remove(ogcService);
    }

    /**
     * Returns the number of o g c services where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching o g c services
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

            query.append(_SQL_COUNT_OGCSERVICE_WHERE);

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
     * Returns all the o g c services where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching o g c services
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCService> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<OGCService> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
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
    @Override
    public List<OGCService> findByUuid_C(String uuid, long companyId,
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

        List<OGCService> list = (List<OGCService>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCService ogcService : list) {
                if (!Validator.equals(uuid, ogcService.getUuid()) ||
                        (companyId != ogcService.getCompanyId())) {
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

            query.append(_SQL_SELECT_OGCSERVICE_WHERE);

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
                query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
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
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCService>(list);
                } else {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first o g c service in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
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
    @Override
    public OGCService fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCService> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
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
    @Override
    public OGCService fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<OGCService> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService[] findByUuid_C_PrevAndNext(long serviceId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = findByPrimaryKey(serviceId);

        Session session = null;

        try {
            session = openSession();

            OGCService[] array = new OGCServiceImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, ogcService, uuid,
                    companyId, orderByComparator, true);

            array[1] = ogcService;

            array[2] = getByUuid_C_PrevAndNext(session, ogcService, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCService getByUuid_C_PrevAndNext(Session session,
        OGCService ogcService, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICE_WHERE);

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
            query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(ogcService);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCService> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c services where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (OGCService ogcService : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ogcService);
        }
    }

    /**
     * Returns the number of o g c services where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching o g c services
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

            query.append(_SQL_COUNT_OGCSERVICE_WHERE);

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
     * Returns all the o g c services where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching o g c services
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCService> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<OGCService> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
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
    @Override
    public List<OGCService> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
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

        List<OGCService> list = (List<OGCService>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCService ogcService : list) {
                if ((groupId != ogcService.getGroupId())) {
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

            query.append(_SQL_SELECT_OGCSERVICE_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCService>(list);
                } else {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first o g c service in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByGroupId_First(groupId, orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
    }

    /**
     * Returns the first o g c service in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service, or <code>null</code> if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCService> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByGroupId_Last(groupId, orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
    }

    /**
     * Returns the last o g c service in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching o g c service, or <code>null</code> if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<OGCService> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService[] findByGroupId_PrevAndNext(long serviceId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = findByPrimaryKey(serviceId);

        Session session = null;

        try {
            session = openSession();

            OGCService[] array = new OGCServiceImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, ogcService, groupId,
                    orderByComparator, true);

            array[1] = ogcService;

            array[2] = getByGroupId_PrevAndNext(session, ogcService, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCService getByGroupId_PrevAndNext(Session session,
        OGCService ogcService, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICE_WHERE);

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
            query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ogcService);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCService> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c services where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (OGCService ogcService : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(ogcService);
        }
    }

    /**
     * Returns the number of o g c services where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching o g c services
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

            query.append(_SQL_COUNT_OGCSERVICE_WHERE);

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
     * Returns all the o g c services where groupId = &#63; and serviceType = &#63;.
     *
     * @param groupId the group ID
     * @param serviceType the service type
     * @return the matching o g c services
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCService> findByG_ST(long groupId, String serviceType)
        throws SystemException {
        return findByG_ST(groupId, serviceType, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<OGCService> findByG_ST(long groupId, String serviceType,
        int start, int end) throws SystemException {
        return findByG_ST(groupId, serviceType, start, end, null);
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
    @Override
    public List<OGCService> findByG_ST(long groupId, String serviceType,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ST;
            finderArgs = new Object[] { groupId, serviceType };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_ST;
            finderArgs = new Object[] {
                    groupId, serviceType,
                    
                    start, end, orderByComparator
                };
        }

        List<OGCService> list = (List<OGCService>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (OGCService ogcService : list) {
                if ((groupId != ogcService.getGroupId()) ||
                        !Validator.equals(serviceType,
                            ogcService.getServiceType())) {
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

            query.append(_SQL_SELECT_OGCSERVICE_WHERE);

            query.append(_FINDER_COLUMN_G_ST_GROUPID_2);

            boolean bindServiceType = false;

            if (serviceType == null) {
                query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_1);
            } else if (serviceType.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_3);
            } else {
                bindServiceType = true;

                query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindServiceType) {
                    qPos.add(serviceType);
                }

                if (!pagination) {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCService>(list);
                } else {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first o g c service in the ordered set where groupId = &#63; and serviceType = &#63;.
     *
     * @param groupId the group ID
     * @param serviceType the service type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a matching o g c service could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByG_ST_First(long groupId, String serviceType,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByG_ST_First(groupId, serviceType,
                orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", serviceType=");
        msg.append(serviceType);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
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
    @Override
    public OGCService fetchByG_ST_First(long groupId, String serviceType,
        OrderByComparator orderByComparator) throws SystemException {
        List<OGCService> list = findByG_ST(groupId, serviceType, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService findByG_ST_Last(long groupId, String serviceType,
        OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByG_ST_Last(groupId, serviceType,
                orderByComparator);

        if (ogcService != null) {
            return ogcService;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", serviceType=");
        msg.append(serviceType);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchOGCServiceException(msg.toString());
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
    @Override
    public OGCService fetchByG_ST_Last(long groupId, String serviceType,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_ST(groupId, serviceType);

        if (count == 0) {
            return null;
        }

        List<OGCService> list = findByG_ST(groupId, serviceType, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public OGCService[] findByG_ST_PrevAndNext(long serviceId, long groupId,
        String serviceType, OrderByComparator orderByComparator)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = findByPrimaryKey(serviceId);

        Session session = null;

        try {
            session = openSession();

            OGCService[] array = new OGCServiceImpl[3];

            array[0] = getByG_ST_PrevAndNext(session, ogcService, groupId,
                    serviceType, orderByComparator, true);

            array[1] = ogcService;

            array[2] = getByG_ST_PrevAndNext(session, ogcService, groupId,
                    serviceType, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected OGCService getByG_ST_PrevAndNext(Session session,
        OGCService ogcService, long groupId, String serviceType,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_OGCSERVICE_WHERE);

        query.append(_FINDER_COLUMN_G_ST_GROUPID_2);

        boolean bindServiceType = false;

        if (serviceType == null) {
            query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_1);
        } else if (serviceType.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_3);
        } else {
            bindServiceType = true;

            query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_2);
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
            query.append(OGCServiceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindServiceType) {
            qPos.add(serviceType);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(ogcService);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<OGCService> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the o g c services where groupId = &#63; and serviceType = &#63; from the database.
     *
     * @param groupId the group ID
     * @param serviceType the service type
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_ST(long groupId, String serviceType)
        throws SystemException {
        for (OGCService ogcService : findByG_ST(groupId, serviceType,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(ogcService);
        }
    }

    /**
     * Returns the number of o g c services where groupId = &#63; and serviceType = &#63;.
     *
     * @param groupId the group ID
     * @param serviceType the service type
     * @return the number of matching o g c services
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_ST(long groupId, String serviceType)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_ST;

        Object[] finderArgs = new Object[] { groupId, serviceType };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_OGCSERVICE_WHERE);

            query.append(_FINDER_COLUMN_G_ST_GROUPID_2);

            boolean bindServiceType = false;

            if (serviceType == null) {
                query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_1);
            } else if (serviceType.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_3);
            } else {
                bindServiceType = true;

                query.append(_FINDER_COLUMN_G_ST_SERVICETYPE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindServiceType) {
                    qPos.add(serviceType);
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
     * Caches the o g c service in the entity cache if it is enabled.
     *
     * @param ogcService the o g c service
     */
    @Override
    public void cacheResult(OGCService ogcService) {
        EntityCacheUtil.putResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceImpl.class, ogcService.getPrimaryKey(), ogcService);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { ogcService.getUuid(), ogcService.getGroupId() },
            ogcService);

        ogcService.resetOriginalValues();
    }

    /**
     * Caches the o g c services in the entity cache if it is enabled.
     *
     * @param ogcServices the o g c services
     */
    @Override
    public void cacheResult(List<OGCService> ogcServices) {
        for (OGCService ogcService : ogcServices) {
            if (EntityCacheUtil.getResult(
                        OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
                        OGCServiceImpl.class, ogcService.getPrimaryKey()) == null) {
                cacheResult(ogcService);
            } else {
                ogcService.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all o g c services.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(OGCServiceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(OGCServiceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the o g c service.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(OGCService ogcService) {
        EntityCacheUtil.removeResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceImpl.class, ogcService.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(ogcService);
    }

    @Override
    public void clearCache(List<OGCService> ogcServices) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (OGCService ogcService : ogcServices) {
            EntityCacheUtil.removeResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
                OGCServiceImpl.class, ogcService.getPrimaryKey());

            clearUniqueFindersCache(ogcService);
        }
    }

    protected void cacheUniqueFindersCache(OGCService ogcService) {
        if (ogcService.isNew()) {
            Object[] args = new Object[] {
                    ogcService.getUuid(), ogcService.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                ogcService);
        } else {
            OGCServiceModelImpl ogcServiceModelImpl = (OGCServiceModelImpl) ogcService;

            if ((ogcServiceModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcService.getUuid(), ogcService.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    ogcService);
            }
        }
    }

    protected void clearUniqueFindersCache(OGCService ogcService) {
        OGCServiceModelImpl ogcServiceModelImpl = (OGCServiceModelImpl) ogcService;

        Object[] args = new Object[] {
                ogcService.getUuid(), ogcService.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((ogcServiceModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    ogcServiceModelImpl.getOriginalUuid(),
                    ogcServiceModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new o g c service with the primary key. Does not add the o g c service to the database.
     *
     * @param serviceId the primary key for the new o g c service
     * @return the new o g c service
     */
    @Override
    public OGCService create(long serviceId) {
        OGCService ogcService = new OGCServiceImpl();

        ogcService.setNew(true);
        ogcService.setPrimaryKey(serviceId);

        String uuid = PortalUUIDUtil.generate();

        ogcService.setUuid(uuid);

        return ogcService;
    }

    /**
     * Removes the o g c service with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param serviceId the primary key of the o g c service
     * @return the o g c service that was removed
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService remove(long serviceId)
        throws NoSuchOGCServiceException, SystemException {
        return remove((Serializable) serviceId);
    }

    /**
     * Removes the o g c service with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the o g c service
     * @return the o g c service that was removed
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService remove(Serializable primaryKey)
        throws NoSuchOGCServiceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            OGCService ogcService = (OGCService) session.get(OGCServiceImpl.class,
                    primaryKey);

            if (ogcService == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchOGCServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(ogcService);
        } catch (NoSuchOGCServiceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected OGCService removeImpl(OGCService ogcService)
        throws SystemException {
        ogcService = toUnwrappedModel(ogcService);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(ogcService)) {
                ogcService = (OGCService) session.get(OGCServiceImpl.class,
                        ogcService.getPrimaryKeyObj());
            }

            if (ogcService != null) {
                session.delete(ogcService);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (ogcService != null) {
            clearCache(ogcService);
        }

        return ogcService;
    }

    @Override
    public OGCService updateImpl(
        de.i3mainz.flexgeo.portal.liferay.services.model.OGCService ogcService)
        throws SystemException {
        ogcService = toUnwrappedModel(ogcService);

        boolean isNew = ogcService.isNew();

        OGCServiceModelImpl ogcServiceModelImpl = (OGCServiceModelImpl) ogcService;

        if (Validator.isNull(ogcService.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            ogcService.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (ogcService.isNew()) {
                session.save(ogcService);

                ogcService.setNew(false);
            } else {
                session.merge(ogcService);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !OGCServiceModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((ogcServiceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { ogcServiceModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((ogcServiceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceModelImpl.getOriginalUuid(),
                        ogcServiceModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        ogcServiceModelImpl.getUuid(),
                        ogcServiceModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((ogcServiceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { ogcServiceModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((ogcServiceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ST.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        ogcServiceModelImpl.getOriginalGroupId(),
                        ogcServiceModelImpl.getOriginalServiceType()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_ST, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ST,
                    args);

                args = new Object[] {
                        ogcServiceModelImpl.getGroupId(),
                        ogcServiceModelImpl.getServiceType()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_ST, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_ST,
                    args);
            }
        }

        EntityCacheUtil.putResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
            OGCServiceImpl.class, ogcService.getPrimaryKey(), ogcService);

        clearUniqueFindersCache(ogcService);
        cacheUniqueFindersCache(ogcService);

        return ogcService;
    }

    protected OGCService toUnwrappedModel(OGCService ogcService) {
        if (ogcService instanceof OGCServiceImpl) {
            return ogcService;
        }

        OGCServiceImpl ogcServiceImpl = new OGCServiceImpl();

        ogcServiceImpl.setNew(ogcService.isNew());
        ogcServiceImpl.setPrimaryKey(ogcService.getPrimaryKey());

        ogcServiceImpl.setUuid(ogcService.getUuid());
        ogcServiceImpl.setServiceId(ogcService.getServiceId());
        ogcServiceImpl.setGroupId(ogcService.getGroupId());
        ogcServiceImpl.setCompanyId(ogcService.getCompanyId());
        ogcServiceImpl.setUserId(ogcService.getUserId());
        ogcServiceImpl.setCreateDate(ogcService.getCreateDate());
        ogcServiceImpl.setModifiedDate(ogcService.getModifiedDate());
        ogcServiceImpl.setServiceName(ogcService.getServiceName());
        ogcServiceImpl.setServiceURL(ogcService.getServiceURL());
        ogcServiceImpl.setServiceType(ogcService.getServiceType());

        return ogcServiceImpl;
    }

    /**
     * Returns the o g c service with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the o g c service
     * @return the o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByPrimaryKey(Serializable primaryKey)
        throws NoSuchOGCServiceException, SystemException {
        OGCService ogcService = fetchByPrimaryKey(primaryKey);

        if (ogcService == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchOGCServiceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return ogcService;
    }

    /**
     * Returns the o g c service with the primary key or throws a {@link de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException} if it could not be found.
     *
     * @param serviceId the primary key of the o g c service
     * @return the o g c service
     * @throws de.i3mainz.flexgeo.portal.liferay.services.NoSuchOGCServiceException if a o g c service with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService findByPrimaryKey(long serviceId)
        throws NoSuchOGCServiceException, SystemException {
        return findByPrimaryKey((Serializable) serviceId);
    }

    /**
     * Returns the o g c service with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the o g c service
     * @return the o g c service, or <code>null</code> if a o g c service with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        OGCService ogcService = (OGCService) EntityCacheUtil.getResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
                OGCServiceImpl.class, primaryKey);

        if (ogcService == _nullOGCService) {
            return null;
        }

        if (ogcService == null) {
            Session session = null;

            try {
                session = openSession();

                ogcService = (OGCService) session.get(OGCServiceImpl.class,
                        primaryKey);

                if (ogcService != null) {
                    cacheResult(ogcService);
                } else {
                    EntityCacheUtil.putResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
                        OGCServiceImpl.class, primaryKey, _nullOGCService);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(OGCServiceModelImpl.ENTITY_CACHE_ENABLED,
                    OGCServiceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return ogcService;
    }

    /**
     * Returns the o g c service with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param serviceId the primary key of the o g c service
     * @return the o g c service, or <code>null</code> if a o g c service with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public OGCService fetchByPrimaryKey(long serviceId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) serviceId);
    }

    /**
     * Returns all the o g c services.
     *
     * @return the o g c services
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<OGCService> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<OGCService> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<OGCService> findAll(int start, int end,
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

        List<OGCService> list = (List<OGCService>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_OGCSERVICE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_OGCSERVICE;

                if (pagination) {
                    sql = sql.concat(OGCServiceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<OGCService>(list);
                } else {
                    list = (List<OGCService>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the o g c services from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (OGCService ogcService : findAll()) {
            remove(ogcService);
        }
    }

    /**
     * Returns the number of o g c services.
     *
     * @return the number of o g c services
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

                Query q = session.createQuery(_SQL_COUNT_OGCSERVICE);

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
     * Initializes the o g c service persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.de.i3mainz.flexgeo.portal.liferay.services.model.OGCService")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<OGCService>> listenersList = new ArrayList<ModelListener<OGCService>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<OGCService>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(OGCServiceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
