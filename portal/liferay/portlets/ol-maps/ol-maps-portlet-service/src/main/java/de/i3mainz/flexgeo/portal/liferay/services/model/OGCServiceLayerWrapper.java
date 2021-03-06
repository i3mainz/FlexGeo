package de.i3mainz.flexgeo.portal.liferay.services.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OGCServiceLayer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayer
 * @generated
 */
public class OGCServiceLayerWrapper implements OGCServiceLayer,
    ModelWrapper<OGCServiceLayer> {
    private OGCServiceLayer _ogcServiceLayer;

    public OGCServiceLayerWrapper(OGCServiceLayer ogcServiceLayer) {
        _ogcServiceLayer = ogcServiceLayer;
    }

    @Override
    public Class<?> getModelClass() {
        return OGCServiceLayer.class;
    }

    @Override
    public String getModelClassName() {
        return OGCServiceLayer.class.getName();
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

    /**
    * Returns the primary key of this o g c service layer.
    *
    * @return the primary key of this o g c service layer
    */
    @Override
    public long getPrimaryKey() {
        return _ogcServiceLayer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this o g c service layer.
    *
    * @param primaryKey the primary key of this o g c service layer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _ogcServiceLayer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this o g c service layer.
    *
    * @return the uuid of this o g c service layer
    */
    @Override
    public java.lang.String getUuid() {
        return _ogcServiceLayer.getUuid();
    }

    /**
    * Sets the uuid of this o g c service layer.
    *
    * @param uuid the uuid of this o g c service layer
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _ogcServiceLayer.setUuid(uuid);
    }

    /**
    * Returns the layer ID of this o g c service layer.
    *
    * @return the layer ID of this o g c service layer
    */
    @Override
    public long getLayerId() {
        return _ogcServiceLayer.getLayerId();
    }

    /**
    * Sets the layer ID of this o g c service layer.
    *
    * @param layerId the layer ID of this o g c service layer
    */
    @Override
    public void setLayerId(long layerId) {
        _ogcServiceLayer.setLayerId(layerId);
    }

    /**
    * Returns the group ID of this o g c service layer.
    *
    * @return the group ID of this o g c service layer
    */
    @Override
    public long getGroupId() {
        return _ogcServiceLayer.getGroupId();
    }

    /**
    * Sets the group ID of this o g c service layer.
    *
    * @param groupId the group ID of this o g c service layer
    */
    @Override
    public void setGroupId(long groupId) {
        _ogcServiceLayer.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this o g c service layer.
    *
    * @return the company ID of this o g c service layer
    */
    @Override
    public long getCompanyId() {
        return _ogcServiceLayer.getCompanyId();
    }

    /**
    * Sets the company ID of this o g c service layer.
    *
    * @param companyId the company ID of this o g c service layer
    */
    @Override
    public void setCompanyId(long companyId) {
        _ogcServiceLayer.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this o g c service layer.
    *
    * @return the user ID of this o g c service layer
    */
    @Override
    public long getUserId() {
        return _ogcServiceLayer.getUserId();
    }

    /**
    * Sets the user ID of this o g c service layer.
    *
    * @param userId the user ID of this o g c service layer
    */
    @Override
    public void setUserId(long userId) {
        _ogcServiceLayer.setUserId(userId);
    }

    /**
    * Returns the user uuid of this o g c service layer.
    *
    * @return the user uuid of this o g c service layer
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ogcServiceLayer.getUserUuid();
    }

    /**
    * Sets the user uuid of this o g c service layer.
    *
    * @param userUuid the user uuid of this o g c service layer
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _ogcServiceLayer.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this o g c service layer.
    *
    * @return the create date of this o g c service layer
    */
    @Override
    public java.util.Date getCreateDate() {
        return _ogcServiceLayer.getCreateDate();
    }

    /**
    * Sets the create date of this o g c service layer.
    *
    * @param createDate the create date of this o g c service layer
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _ogcServiceLayer.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this o g c service layer.
    *
    * @return the modified date of this o g c service layer
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _ogcServiceLayer.getModifiedDate();
    }

    /**
    * Sets the modified date of this o g c service layer.
    *
    * @param modifiedDate the modified date of this o g c service layer
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _ogcServiceLayer.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the layer name of this o g c service layer.
    *
    * @return the layer name of this o g c service layer
    */
    @Override
    public java.lang.String getLayerName() {
        return _ogcServiceLayer.getLayerName();
    }

    /**
    * Sets the layer name of this o g c service layer.
    *
    * @param layerName the layer name of this o g c service layer
    */
    @Override
    public void setLayerName(java.lang.String layerName) {
        _ogcServiceLayer.setLayerName(layerName);
    }

    /**
    * Returns the layer service ID of this o g c service layer.
    *
    * @return the layer service ID of this o g c service layer
    */
    @Override
    public long getLayerServiceId() {
        return _ogcServiceLayer.getLayerServiceId();
    }

    /**
    * Sets the layer service ID of this o g c service layer.
    *
    * @param layerServiceId the layer service ID of this o g c service layer
    */
    @Override
    public void setLayerServiceId(long layerServiceId) {
        _ogcServiceLayer.setLayerServiceId(layerServiceId);
    }

    /**
    * Returns the layer options of this o g c service layer.
    *
    * @return the layer options of this o g c service layer
    */
    @Override
    public java.lang.String getLayerOptions() {
        return _ogcServiceLayer.getLayerOptions();
    }

    /**
    * Sets the layer options of this o g c service layer.
    *
    * @param layerOptions the layer options of this o g c service layer
    */
    @Override
    public void setLayerOptions(java.lang.String layerOptions) {
        _ogcServiceLayer.setLayerOptions(layerOptions);
    }

    /**
    * Returns the layer display options of this o g c service layer.
    *
    * @return the layer display options of this o g c service layer
    */
    @Override
    public java.lang.String getLayerDisplayOptions() {
        return _ogcServiceLayer.getLayerDisplayOptions();
    }

    /**
    * Sets the layer display options of this o g c service layer.
    *
    * @param layerDisplayOptions the layer display options of this o g c service layer
    */
    @Override
    public void setLayerDisplayOptions(java.lang.String layerDisplayOptions) {
        _ogcServiceLayer.setLayerDisplayOptions(layerDisplayOptions);
    }

    @Override
    public boolean isNew() {
        return _ogcServiceLayer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _ogcServiceLayer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _ogcServiceLayer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _ogcServiceLayer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _ogcServiceLayer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _ogcServiceLayer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ogcServiceLayer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ogcServiceLayer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _ogcServiceLayer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _ogcServiceLayer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ogcServiceLayer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new OGCServiceLayerWrapper((OGCServiceLayer) _ogcServiceLayer.clone());
    }

    @Override
    public int compareTo(OGCServiceLayer ogcServiceLayer) {
        return _ogcServiceLayer.compareTo(ogcServiceLayer);
    }

    @Override
    public int hashCode() {
        return _ogcServiceLayer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<OGCServiceLayer> toCacheModel() {
        return _ogcServiceLayer.toCacheModel();
    }

    @Override
    public OGCServiceLayer toEscapedModel() {
        return new OGCServiceLayerWrapper(_ogcServiceLayer.toEscapedModel());
    }

    @Override
    public OGCServiceLayer toUnescapedModel() {
        return new OGCServiceLayerWrapper(_ogcServiceLayer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ogcServiceLayer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _ogcServiceLayer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ogcServiceLayer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof OGCServiceLayerWrapper)) {
            return false;
        }

        OGCServiceLayerWrapper ogcServiceLayerWrapper = (OGCServiceLayerWrapper) obj;

        if (Validator.equals(_ogcServiceLayer,
                    ogcServiceLayerWrapper._ogcServiceLayer)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _ogcServiceLayer.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public OGCServiceLayer getWrappedOGCServiceLayer() {
        return _ogcServiceLayer;
    }

    @Override
    public OGCServiceLayer getWrappedModel() {
        return _ogcServiceLayer;
    }

    @Override
    public void resetOriginalValues() {
        _ogcServiceLayer.resetOriginalValues();
    }
}
