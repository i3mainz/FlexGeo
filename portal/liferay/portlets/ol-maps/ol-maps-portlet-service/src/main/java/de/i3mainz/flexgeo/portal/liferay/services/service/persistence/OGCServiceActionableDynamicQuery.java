package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class OGCServiceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public OGCServiceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(OGCServiceLocalServiceUtil.getService());
        setClass(OGCService.class);

        setClassLoader(de.i3mainz.flexgeo.portal.liferay.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("serviceId");
    }
}
