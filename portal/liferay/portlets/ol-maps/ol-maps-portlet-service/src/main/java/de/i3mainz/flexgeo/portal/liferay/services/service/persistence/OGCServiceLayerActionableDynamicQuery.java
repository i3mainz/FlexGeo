package de.i3mainz.flexgeo.portal.liferay.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class OGCServiceLayerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public OGCServiceLayerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(OGCServiceLayerLocalServiceUtil.getService());
        setClass(OGCServiceLayer.class);

        setClassLoader(de.i3mainz.flexgeo.portal.liferay.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("layerId");
    }
}
