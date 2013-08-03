package de.i3mainz.flexgeo.portal.liferay.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class OGCServiceClp extends BaseModelImpl<OGCService>
    implements OGCService {
    private String _uuid;
    private long _serviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _serviceName;
    private String _serviceURL;
    private String _serviceType;
    private BaseModel<?> _ogcServiceRemoteModel;

    public OGCServiceClp() {
    }

    public Class<?> getModelClass() {
        return OGCService.class;
    }

    public String getModelClassName() {
        return OGCService.class.getName();
    }

    public long getPrimaryKey() {
        return _serviceId;
    }

    public void setPrimaryKey(long primaryKey) {
        setServiceId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_serviceId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("serviceId", getServiceId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("serviceName", getServiceName());
        attributes.put("serviceURL", getServiceURL());
        attributes.put("serviceType", getServiceType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long serviceId = (Long) attributes.get("serviceId");

        if (serviceId != null) {
            setServiceId(serviceId);
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

        String serviceName = (String) attributes.get("serviceName");

        if (serviceName != null) {
            setServiceName(serviceName);
        }

        String serviceURL = (String) attributes.get("serviceURL");

        if (serviceURL != null) {
            setServiceURL(serviceURL);
        }

        String serviceType = (String) attributes.get("serviceType");

        if (serviceType != null) {
            setServiceType(serviceType);
        }
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getServiceId() {
        return _serviceId;
    }

    public void setServiceId(long serviceId) {
        _serviceId = serviceId;
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

    public String getServiceName() {
        return _serviceName;
    }

    public void setServiceName(String serviceName) {
        _serviceName = serviceName;
    }

    public String getServiceURL() {
        return _serviceURL;
    }

    public void setServiceURL(String serviceURL) {
        _serviceURL = serviceURL;
    }

    public String getServiceType() {
        return _serviceType;
    }

    public void setServiceType(String serviceType) {
        _serviceType = serviceType;
    }

    public BaseModel<?> getOGCServiceRemoteModel() {
        return _ogcServiceRemoteModel;
    }

    public void setOGCServiceRemoteModel(BaseModel<?> ogcServiceRemoteModel) {
        _ogcServiceRemoteModel = ogcServiceRemoteModel;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            OGCServiceLocalServiceUtil.addOGCService(this);
        } else {
            OGCServiceLocalServiceUtil.updateOGCService(this);
        }
    }

    @Override
    public OGCService toEscapedModel() {
        return (OGCService) Proxy.newProxyInstance(OGCService.class.getClassLoader(),
            new Class[] { OGCService.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        OGCServiceClp clone = new OGCServiceClp();

        clone.setUuid(getUuid());
        clone.setServiceId(getServiceId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setServiceName(getServiceName());
        clone.setServiceURL(getServiceURL());
        clone.setServiceType(getServiceType());

        return clone;
    }

    public int compareTo(OGCService ogcService) {
        int value = 0;

        if (getServiceId() < ogcService.getServiceId()) {
            value = -1;
        } else if (getServiceId() > ogcService.getServiceId()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        OGCServiceClp ogcService = null;

        try {
            ogcService = (OGCServiceClp) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = ogcService.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", serviceId=");
        sb.append(getServiceId());
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
        sb.append(", serviceName=");
        sb.append(getServiceName());
        sb.append(", serviceURL=");
        sb.append(getServiceURL());
        sb.append(", serviceType=");
        sb.append(getServiceType());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("de.i3mainz.flexgeo.portal.liferay.services.model.OGCService");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceId</column-name><column-value><![CDATA[");
        sb.append(getServiceId());
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
            "<column><column-name>serviceName</column-name><column-value><![CDATA[");
        sb.append(getServiceName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceURL</column-name><column-value><![CDATA[");
        sb.append(getServiceURL());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>serviceType</column-name><column-value><![CDATA[");
        sb.append(getServiceType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
