package de.i3mainz.flexgeo.portal.liferay.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class OGCServiceLayerClp extends BaseModelImpl<OGCServiceLayer>
    implements OGCServiceLayer {
    private String _uuid;
    private long _layerId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _layerName;
    private long _layerServiceId;
    private String _layerOptions;
    private String _layerDisplayOptions;
    private BaseModel<?> _ogcServiceLayerRemoteModel;

    public OGCServiceLayerClp() {
    }

    public Class<?> getModelClass() {
        return OGCServiceLayer.class;
    }

    public String getModelClassName() {
        return OGCServiceLayer.class.getName();
    }

    public long getPrimaryKey() {
        return _layerId;
    }

    public void setPrimaryKey(long primaryKey) {
        setLayerId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_layerId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("layerId", getLayerId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("layerName", getLayerName());
        attributes.put("layerServiceId", getLayerServiceId());
        attributes.put("layerOptions", getLayerOptions());
        attributes.put("layerDisplayOptions", getLayerDisplayOptions());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long layerId = (Long) attributes.get("layerId");

        if (layerId != null) {
            setLayerId(layerId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String layerName = (String) attributes.get("layerName");

        if (layerName != null) {
            setLayerName(layerName);
        }

        Long layerServiceId = (Long) attributes.get("layerServiceId");

        if (layerServiceId != null) {
            setLayerServiceId(layerServiceId);
        }

        String layerOptions = (String) attributes.get("layerOptions");

        if (layerOptions != null) {
            setLayerOptions(layerOptions);
        }

        String layerDisplayOptions = (String) attributes.get(
                "layerDisplayOptions");

        if (layerDisplayOptions != null) {
            setLayerDisplayOptions(layerDisplayOptions);
        }
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getLayerId() {
        return _layerId;
    }

    public void setLayerId(long layerId) {
        _layerId = layerId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getLayerName() {
        return _layerName;
    }

    public void setLayerName(String layerName) {
        _layerName = layerName;
    }

    public long getLayerServiceId() {
        return _layerServiceId;
    }

    public void setLayerServiceId(long layerServiceId) {
        _layerServiceId = layerServiceId;
    }

    public String getLayerOptions() {
        return _layerOptions;
    }

    public void setLayerOptions(String layerOptions) {
        _layerOptions = layerOptions;
    }

    public String getLayerDisplayOptions() {
        return _layerDisplayOptions;
    }

    public void setLayerDisplayOptions(String layerDisplayOptions) {
        _layerDisplayOptions = layerDisplayOptions;
    }

    public BaseModel<?> getOGCServiceLayerRemoteModel() {
        return _ogcServiceLayerRemoteModel;
    }

    public void setOGCServiceLayerRemoteModel(
        BaseModel<?> ogcServiceLayerRemoteModel) {
        _ogcServiceLayerRemoteModel = ogcServiceLayerRemoteModel;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            OGCServiceLayerLocalServiceUtil.addOGCServiceLayer(this);
        } else {
            OGCServiceLayerLocalServiceUtil.updateOGCServiceLayer(this);
        }
    }

    @Override
    public OGCServiceLayer toEscapedModel() {
        return (OGCServiceLayer) Proxy.newProxyInstance(OGCServiceLayer.class.getClassLoader(),
            new Class[] { OGCServiceLayer.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        OGCServiceLayerClp clone = new OGCServiceLayerClp();

        clone.setUuid(getUuid());
        clone.setLayerId(getLayerId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setLayerName(getLayerName());
        clone.setLayerServiceId(getLayerServiceId());
        clone.setLayerOptions(getLayerOptions());
        clone.setLayerDisplayOptions(getLayerDisplayOptions());

        return clone;
    }

    public int compareTo(OGCServiceLayer ogcServiceLayer) {
        long primaryKey = ogcServiceLayer.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        OGCServiceLayerClp ogcServiceLayer = null;

        try {
            ogcServiceLayer = (OGCServiceLayerClp) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = ogcServiceLayer.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", layerId=");
        sb.append(getLayerId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", layerName=");
        sb.append(getLayerName());
        sb.append(", layerServiceId=");
        sb.append(getLayerServiceId());
        sb.append(", layerOptions=");
        sb.append(getLayerOptions());
        sb.append(", layerDisplayOptions=");
        sb.append(getLayerDisplayOptions());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append(
            "de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layerId</column-name><column-value><![CDATA[");
        sb.append(getLayerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layerName</column-name><column-value><![CDATA[");
        sb.append(getLayerName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layerServiceId</column-name><column-value><![CDATA[");
        sb.append(getLayerServiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layerOptions</column-name><column-value><![CDATA[");
        sb.append(getLayerOptions());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>layerDisplayOptions</column-name><column-value><![CDATA[");
        sb.append(getLayerDisplayOptions());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
