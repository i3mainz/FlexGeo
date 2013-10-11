package de.i3mainz.flexgeo.portal.liferay.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.i3mainz.flexgeo.portal.liferay.services.service.http.OGCServiceLayerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.http.OGCServiceLayerServiceSoap
 * @generated
 */
public class OGCServiceLayerSoap implements Serializable {
    private String _uuid;
    private long _layerId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _layerName;
    private long _layerServiceId;
    private String _layerOptions;
    private String _layerDisplayOptions;

    public OGCServiceLayerSoap() {
    }

    public static OGCServiceLayerSoap toSoapModel(OGCServiceLayer model) {
        OGCServiceLayerSoap soapModel = new OGCServiceLayerSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setLayerId(model.getLayerId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setLayerName(model.getLayerName());
        soapModel.setLayerServiceId(model.getLayerServiceId());
        soapModel.setLayerOptions(model.getLayerOptions());
        soapModel.setLayerDisplayOptions(model.getLayerDisplayOptions());

        return soapModel;
    }

    public static OGCServiceLayerSoap[] toSoapModels(OGCServiceLayer[] models) {
        OGCServiceLayerSoap[] soapModels = new OGCServiceLayerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static OGCServiceLayerSoap[][] toSoapModels(
        OGCServiceLayer[][] models) {
        OGCServiceLayerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new OGCServiceLayerSoap[models.length][models[0].length];
        } else {
            soapModels = new OGCServiceLayerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static OGCServiceLayerSoap[] toSoapModels(
        List<OGCServiceLayer> models) {
        List<OGCServiceLayerSoap> soapModels = new ArrayList<OGCServiceLayerSoap>(models.size());

        for (OGCServiceLayer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new OGCServiceLayerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _layerId;
    }

    public void setPrimaryKey(long pk) {
        setLayerId(pk);
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
}
