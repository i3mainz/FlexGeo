package de.i3mainz.flexgeo.portal.liferay.services.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;
import de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceLayerLocalServiceBaseImpl;

/**
 * The implementation of the o g c service layer local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceLayerLocalServiceBaseImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalServiceUtil
 */
public class OGCServiceLayerLocalServiceImpl extends
		OGCServiceLayerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * de.i3mainz.flexgeo
	 * .portal.liferay.services.service.OGCServiceLayerLocalServiceUtil} to
	 * access the o g c service layer local service.
	 */

	public OGCServiceLayer addLayer(long userId, String layerName,
			long layerServiceId, String layerOptions,
			String layerDisplayOptions, ServiceContext serviceContext)
			throws PortalException, SystemException {

		User user = userPersistence.findByPrimaryKey(userId);
		long companyId = user.getCompanyId();

		Date now = new Date();
		long groupId = serviceContext.getScopeGroupId();

		long entryId = counterLocalService.increment();

		OGCServiceLayer entry = ogcServiceLayerPersistence.create(entryId);

		entry.setUuid(serviceContext.getUuid());
		entry.setGroupId(groupId);
		entry.setCompanyId(companyId);
		entry.setUserId(user.getUserId());
		entry.setCreateDate(now);
		entry.setModifiedDate(serviceContext.getModifiedDate(now));

		entry.setLayerName(layerName);
		entry.setLayerServiceId(layerServiceId);
		entry.setLayerOptions(layerOptions);
		entry.setLayerDisplayOptions(layerDisplayOptions);

		ogcServiceLayerPersistence.update(entry, false);

		// Resources

		if (serviceContext.isAddGroupPermissions()
				|| serviceContext.isAddGuestPermissions()) {

			addEntryResources(entry, serviceContext.isAddGroupPermissions(),
					serviceContext.isAddGuestPermissions());
		} else {
			addEntryResources(entry, serviceContext.getGroupPermissions(),
					serviceContext.getGuestPermissions());
		}

		return entry;

	}

	public void addEntryResources(OGCServiceLayer layer,
			boolean addGroupPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(layer.getCompanyId(),
				layer.getGroupId(), layer.getUserId(),
				OGCServiceLayer.class.getName(), layer.getUuid(), false,
				addGroupPermissions, addGuestPermissions);
	}

	public void addEntryResources(OGCServiceLayer layer,
			String[] groupPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(layer.getCompanyId(),
				layer.getGroupId(), layer.getUserId(),
				OGCServiceLayer.class.getName(), layer.getUuid(),
				groupPermissions, guestPermissions);
	}

	public void addEntryResources(long entryId, boolean addGroupPermissions,
			boolean addGuestPermissions) throws PortalException,
			SystemException {

		OGCServiceLayer ogcService = ogcServiceLayerPersistence
				.findByPrimaryKey(entryId);

		addEntryResources(ogcService, addGroupPermissions, addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] groupPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		OGCServiceLayer ogcService = ogcServiceLayerPersistence
				.findByPrimaryKey(entryId);

		addEntryResources(ogcService, groupPermissions, guestPermissions);
	}
}
