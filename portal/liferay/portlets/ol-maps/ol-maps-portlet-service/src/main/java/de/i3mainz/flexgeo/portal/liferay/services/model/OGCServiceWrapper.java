package de.i3mainz.flexgeo.portal.liferay.services.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OGCService}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCService
 * @generated
 */
public class OGCServiceWrapper implements OGCService, ModelWrapper<OGCService> {
    private OGCService _ogcService;

    public OGCServiceWrapper(OGCService ogcService) {
        _ogcService = ogcService;
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

    /**
    * Returns the primary key of this o g c service.
    *
    * @return the primary key of this o g c service
    */
    @Override
    public long getPrimaryKey() {
        return _ogcService.getPrimaryKey();
    }

    /**
    * Sets the primary key of this o g c service.
    *
    * @param primaryKey the primary key of this o g c service
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _ogcService.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this o g c service.
    *
    * @return the uuid of this o g c service
    */
    @Override
    public java.lang.String getUuid() {
        return _ogcService.getUuid();
    }

    /**
    * Sets the uuid of this o g c service.
    *
    * @param uuid the uuid of this o g c service
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _ogcService.setUuid(uuid);
    }

    /**
    * Returns the service ID of this o g c service.
    *
    * @return the service ID of this o g c service
    */
    @Override
    public long getServiceId() {
        return _ogcService.getServiceId();
    }

    /**
    * Sets the service ID of this o g c service.
    *
    * @param serviceId the service ID of this o g c service
    */
    @Override
    public void setServiceId(long serviceId) {
        _ogcService.setServiceId(serviceId);
    }

    /**
    * Returns the group ID of this o g c service.
    *
    * @return the group ID of this o g c service
    */
    @Override
    public long getGroupId() {
        return _ogcService.getGroupId();
    }

    /**
    * Sets the group ID of this o g c service.
    *
    * @param groupId the group ID of this o g c service
    */
    @Override
    public void setGroupId(long groupId) {
        _ogcService.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this o g c service.
    *
    * @return the company ID of this o g c service
    */
    @Override
    public long getCompanyId() {
        return _ogcService.getCompanyId();
    }

    /**
    * Sets the company ID of this o g c service.
    *
    * @param companyId the company ID of this o g c service
    */
    @Override
    public void setCompanyId(long companyId) {
        _ogcService.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this o g c service.
    *
    * @return the user ID of this o g c service
    */
    @Override
    public long getUserId() {
        return _ogcService.getUserId();
    }

    /**
    * Sets the user ID of this o g c service.
    *
    * @param userId the user ID of this o g c service
    */
    @Override
    public void setUserId(long userId) {
        _ogcService.setUserId(userId);
    }

    /**
    * Returns the user uuid of this o g c service.
    *
    * @return the user uuid of this o g c service
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcService.getUserUuid();
    }

    /**
    * Sets the user uuid of this o g c service.
    *
    * @param userUuid the user uuid of this o g c service
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _ogcService.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this o g c service.
    *
    * @return the create date of this o g c service
    */
    @Override
    public java.util.Date getCreateDate() {
        return _ogcService.getCreateDate();
    }

    /**
    * Sets the create date of this o g c service.
    *
    * @param createDate the create date of this o g c service
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _ogcService.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this o g c service.
    *
    * @return the modified date of this o g c service
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _ogcService.getModifiedDate();
    }

    /**
    * Sets the modified date of this o g c service.
    *
    * @param modifiedDate the modified date of this o g c service
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _ogcService.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the service name of this o g c service.
    *
    * @return the service name of this o g c service
    */
    @Override
    public java.lang.String getServiceName() {
        return _ogcService.getServiceName();
    }

    /**
    * Sets the service name of this o g c service.
    *
    * @param serviceName the service name of this o g c service
    */
    @Override
    public void setServiceName(java.lang.String serviceName) {
        _ogcService.setServiceName(serviceName);
    }

    /**
    * Returns the service u r l of this o g c service.
    *
    * @return the service u r l of this o g c service
    */
    @Override
    public java.lang.String getServiceURL() {
        return _ogcService.getServiceURL();
    }

    /**
    * Sets the service u r l of this o g c service.
    *
    * @param serviceURL the service u r l of this o g c service
    */
    @Override
    public void setServiceURL(java.lang.String serviceURL) {
        _ogcService.setServiceURL(serviceURL);
    }

    /**
    * Returns the service type of this o g c service.
    *
    * @return the service type of this o g c service
    */
    @Override
    public java.lang.String getServiceType() {
        return _ogcService.getServiceType();
    }

    /**
    * Sets the service type of this o g c service.
    *
    * @param serviceType the service type of this o g c service
    */
    @Override
    public void setServiceType(java.lang.String serviceType) {
        _ogcService.setServiceType(serviceType);
    }

    @Override
    public boolean isNew() {
        return _ogcService.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _ogcService.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _ogcService.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _ogcService.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _ogcService.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _ogcService.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ogcService.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ogcService.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _ogcService.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _ogcService.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ogcService.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new OGCServiceWrapper((OGCService) _ogcService.clone());
    }

    @Override
    public int compareTo(OGCService ogcService) {
        return _ogcService.compareTo(ogcService);
    }

    @Override
    public int hashCode() {
        return _ogcService.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<OGCService> toCacheModel() {
        return _ogcService.toCacheModel();
    }

    @Override
    public OGCService toEscapedModel() {
        return new OGCServiceWrapper(_ogcService.toEscapedModel());
    }

    @Override
    public OGCService toUnescapedModel() {
        return new OGCServiceWrapper(_ogcService.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ogcService.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _ogcService.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ogcService.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OGCServiceWrapper)) {
            return false;
        }

        OGCServiceWrapper ogcServiceWrapper = (OGCServiceWrapper) obj;

        if (Validator.equals(_ogcService, ogcServiceWrapper._ogcService)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _ogcService.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public OGCService getWrappedOGCService() {
        return _ogcService;
    }

    @Override
    public OGCService getWrappedModel() {
        return _ogcService;
    }

    @Override
    public void resetOriginalValues() {
        _ogcService.resetOriginalValues();
    }
}
