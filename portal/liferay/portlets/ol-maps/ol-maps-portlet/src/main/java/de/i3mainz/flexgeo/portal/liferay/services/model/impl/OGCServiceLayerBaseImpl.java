package de.i3mainz.flexgeo.portal.liferay.services.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalServiceUtil;

/**
 * The extended model base implementation for the OGCServiceLayer service. Represents a row in the &quot;olmaps_OGCServiceLayer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OGCServiceLayerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGCServiceLayerImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer
 * @generated
 */
public abstract class OGCServiceLayerBaseImpl extends OGCServiceLayerModelImpl
    implements OGCServiceLayer {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a o g c service layer model instance should use the {@link OGCServiceLayer} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            OGCServiceLayerLocalServiceUtil.addOGCServiceLayer(this);
        } else {
            OGCServiceLayerLocalServiceUtil.updateOGCServiceLayer(this);
        }
    }
}
