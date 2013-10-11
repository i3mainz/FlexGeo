package de.i3mainz.flexgeo.portal.liferay.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OGCService in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OGCService
 * @generated
 */
public class OGCServiceCacheModel implements CacheModel<OGCService>,
    Externalizable {
    public String uuid;
    public long serviceId;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String serviceName;
    public String serviceURL;
    public String serviceType;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", serviceId=");
        sb.append(serviceId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", serviceName=");
        sb.append(serviceName);
        sb.append(", serviceURL=");
        sb.append(serviceURL);
        sb.append(", serviceType=");
        sb.append(serviceType);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public OGCService toEntityModel() {
        OGCServiceImpl ogcServiceImpl = new OGCServiceImpl();

        if (uuid == null) {
            ogcServiceImpl.setUuid(StringPool.BLANK);
        } else {
            ogcServiceImpl.setUuid(uuid);
        }

        ogcServiceImpl.setServiceId(serviceId);
        ogcServiceImpl.setGroupId(groupId);
        ogcServiceImpl.setCompanyId(companyId);
        ogcServiceImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            ogcServiceImpl.setCreateDate(null);
        } else {
            ogcServiceImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            ogcServiceImpl.setModifiedDate(null);
        } else {
            ogcServiceImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (serviceName == null) {
            ogcServiceImpl.setServiceName(StringPool.BLANK);
        } else {
            ogcServiceImpl.setServiceName(serviceName);
        }

        if (serviceURL == null) {
            ogcServiceImpl.setServiceURL(StringPool.BLANK);
        } else {
            ogcServiceImpl.setServiceURL(serviceURL);
        }

        if (serviceType == null) {
            ogcServiceImpl.setServiceType(StringPool.BLANK);
        } else {
            ogcServiceImpl.setServiceType(serviceType);
        }

        ogcServiceImpl.resetOriginalValues();

        return ogcServiceImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        serviceId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        serviceName = objectInput.readUTF();
        serviceURL = objectInput.readUTF();
        serviceType = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(serviceId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (serviceName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceName);
        }

        if (serviceURL == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceURL);
        }

        if (serviceType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(serviceType);
        }
    }
}
