package de.i3mainz.flexgeo.portal.liferay.services.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OGCServiceLayer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayer
 * @generated
 */
public class OGCServiceLayerCacheModel implements CacheModel<OGCServiceLayer>,
    Externalizable {
    public String uuid;
    public long layerId;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String layerName;
    public long layerServiceId;
    public String layerOptions;
    public String layerDisplayOptions;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", layerId=");
        sb.append(layerId);
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
        sb.append(", layerName=");
        sb.append(layerName);
        sb.append(", layerServiceId=");
        sb.append(layerServiceId);
        sb.append(", layerOptions=");
        sb.append(layerOptions);
        sb.append(", layerDisplayOptions=");
        sb.append(layerDisplayOptions);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public OGCServiceLayer toEntityModel() {
        OGCServiceLayerImpl ogcServiceLayerImpl = new OGCServiceLayerImpl();

        if (uuid == null) {
            ogcServiceLayerImpl.setUuid(StringPool.BLANK);
        } else {
            ogcServiceLayerImpl.setUuid(uuid);
        }

        ogcServiceLayerImpl.setLayerId(layerId);
        ogcServiceLayerImpl.setGroupId(groupId);
        ogcServiceLayerImpl.setCompanyId(companyId);
        ogcServiceLayerImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            ogcServiceLayerImpl.setCreateDate(null);
        } else {
            ogcServiceLayerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            ogcServiceLayerImpl.setModifiedDate(null);
        } else {
            ogcServiceLayerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (layerName == null) {
            ogcServiceLayerImpl.setLayerName(StringPool.BLANK);
        } else {
            ogcServiceLayerImpl.setLayerName(layerName);
        }

        ogcServiceLayerImpl.setLayerServiceId(layerServiceId);

        if (layerOptions == null) {
            ogcServiceLayerImpl.setLayerOptions(StringPool.BLANK);
        } else {
            ogcServiceLayerImpl.setLayerOptions(layerOptions);
        }

        if (layerDisplayOptions == null) {
            ogcServiceLayerImpl.setLayerDisplayOptions(StringPool.BLANK);
        } else {
            ogcServiceLayerImpl.setLayerDisplayOptions(layerDisplayOptions);
        }

        ogcServiceLayerImpl.resetOriginalValues();

        return ogcServiceLayerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        layerId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        layerName = objectInput.readUTF();
        layerServiceId = objectInput.readLong();
        layerOptions = objectInput.readUTF();
        layerDisplayOptions = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(layerId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (layerName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(layerName);
        }

        objectOutput.writeLong(layerServiceId);

        if (layerOptions == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(layerOptions);
        }

        if (layerDisplayOptions == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(layerDisplayOptions);
        }
    }
}
