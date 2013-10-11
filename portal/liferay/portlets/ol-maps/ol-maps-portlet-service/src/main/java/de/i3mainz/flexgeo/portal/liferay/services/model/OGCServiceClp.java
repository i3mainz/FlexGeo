package de.i3mainz.flexgeo.portal.liferay.services.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import de.i3mainz.flexgeo.portal.liferay.services.service.ClpSerializer;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

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

    @Override
    public Class<?> getModelClass() {
        return OGCService.class;
    }

    @Override
    public String getModelClassName() {
        return OGCService.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _serviceId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setServiceId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _serviceId;
    }

    @Override
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_ogcServiceRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getServiceId() {
        return _serviceId;
    }

    @Override
    public void setServiceId(long serviceId) {
        _serviceId = serviceId;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceId", long.class);

                method.invoke(_ogcServiceRemoteModel, serviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_ogcServiceRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_ogcServiceRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_ogcServiceRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_ogcServiceRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_ogcServiceRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceName() {
        return _serviceName;
    }

    @Override
    public void setServiceName(String serviceName) {
        _serviceName = serviceName;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceName", String.class);

                method.invoke(_ogcServiceRemoteModel, serviceName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceURL() {
        return _serviceURL;
    }

    @Override
    public void setServiceURL(String serviceURL) {
        _serviceURL = serviceURL;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceURL", String.class);

                method.invoke(_ogcServiceRemoteModel, serviceURL);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getServiceType() {
        return _serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        _serviceType = serviceType;

        if (_ogcServiceRemoteModel != null) {
            try {
                Class<?> clazz = _ogcServiceRemoteModel.getClass();

                Method method = clazz.getMethod("setServiceType", String.class);

                method.invoke(_ogcServiceRemoteModel, serviceType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                OGCService.class.getName()));
    }

    public BaseModel<?> getOGCServiceRemoteModel() {
        return _ogcServiceRemoteModel;
    }

    public void setOGCServiceRemoteModel(BaseModel<?> ogcServiceRemoteModel) {
        _ogcServiceRemoteModel = ogcServiceRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _ogcServiceRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_ogcServiceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            OGCServiceLocalServiceUtil.addOGCService(this);
        } else {
            OGCServiceLocalServiceUtil.updateOGCService(this);
        }
    }

    @Override
    public OGCService toEscapedModel() {
        return (OGCService) ProxyUtil.newProxyInstance(OGCService.class.getClassLoader(),
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

    @Override
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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OGCServiceClp)) {
            return false;
        }

        OGCServiceClp ogcService = (OGCServiceClp) obj;

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

    @Override
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
