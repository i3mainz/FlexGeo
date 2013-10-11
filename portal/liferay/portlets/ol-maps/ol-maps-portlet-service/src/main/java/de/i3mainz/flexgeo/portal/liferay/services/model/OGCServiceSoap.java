package de.i3mainz.flexgeo.portal.liferay.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link de.i3mainz.flexgeo.portal.liferay.services.service.http.OGCServiceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.http.OGCServiceServiceSoap
 * @generated
 */
public class OGCServiceSoap implements Serializable {
    private String _uuid;
    private long _serviceId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _serviceName;
    private String _serviceURL;
    private String _serviceType;

    public OGCServiceSoap() {
    }

    public static OGCServiceSoap toSoapModel(OGCService model) {
        OGCServiceSoap soapModel = new OGCServiceSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setServiceId(model.getServiceId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setServiceName(model.getServiceName());
        soapModel.setServiceURL(model.getServiceURL());
        soapModel.setServiceType(model.getServiceType());

        return soapModel;
    }

    public static OGCServiceSoap[] toSoapModels(OGCService[] models) {
        OGCServiceSoap[] soapModels = new OGCServiceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static OGCServiceSoap[][] toSoapModels(OGCService[][] models) {
        OGCServiceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new OGCServiceSoap[models.length][models[0].length];
        } else {
            soapModels = new OGCServiceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static OGCServiceSoap[] toSoapModels(List<OGCService> models) {
        List<OGCServiceSoap> soapModels = new ArrayList<OGCServiceSoap>(models.size());

        for (OGCService model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new OGCServiceSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _serviceId;
    }

    public void setPrimaryKey(long pk) {
        setServiceId(pk);
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
}
