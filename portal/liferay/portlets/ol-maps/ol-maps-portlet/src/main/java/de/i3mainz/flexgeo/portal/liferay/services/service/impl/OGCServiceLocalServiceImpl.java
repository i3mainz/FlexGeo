package de.i3mainz.flexgeo.portal.liferay.services.service.impl;

import java.net.URL;
import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCService;
import de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceLocalServiceBaseImpl;

/**
 * The implementation of the o g c service local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Brian Wing Shun Chan
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.base.OGCServiceLocalServiceBaseImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalServiceUtil
 */
public class OGCServiceLocalServiceImpl extends OGCServiceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * de.i3mainz.flexgeo
	 * .portal.liferay.services.service.OGCServiceLocalServiceUtil} to access
	 * the o g c service local service.
	 */

	public OGCService addOGCService(long userId, String serviceName,
			String serviceType, URL serviceURL, String content, String format,
			ServiceContext serviceContext) throws PortalException,
			SystemException {

		User user = userPersistence.findByPrimaryKey(userId);
		long companyId = user.getCompanyId();

		Date now = new Date();
		long groupId = serviceContext.getScopeGroupId();

		long entryId = counterLocalService.increment();

		OGCService entry = ogcServicePersistence.create(entryId);

		entry.setUuid(serviceContext.getUuid());
		entry.setGroupId(groupId);
		entry.setCompanyId(companyId);
		entry.setUserId(user.getUserId());
		entry.setCreateDate(now);
		entry.setModifiedDate(serviceContext.getModifiedDate(now));

		ogcServicePersistence.update(entry, false);

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

	public void addEntryResources(OGCService ogcService,
			boolean addGroupPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(ogcService.getCompanyId(),
				ogcService.getGroupId(), ogcService.getUserId(),
				OGCService.class.getName(), ogcService.getUuid(), false,
				addGroupPermissions, addGuestPermissions);
	}

	public void addEntryResources(OGCService ogcService,
			String[] groupPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(ogcService.getCompanyId(),
				ogcService.getGroupId(), ogcService.getUserId(),
				OGCService.class.getName(), ogcService.getUuid(),
				groupPermissions, guestPermissions);
	}

	public void addEntryResources(long entryId, boolean addGroupPermissions,
			boolean addGuestPermissions) throws PortalException,
			SystemException {

		OGCService ogcService = ogcServicePersistence.findByPrimaryKey(entryId);

		addEntryResources(ogcService, addGroupPermissions, addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] groupPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		OGCService ogcService = ogcServicePersistence.findByPrimaryKey(entryId);

		addEntryResources(ogcService, groupPermissions, guestPermissions);
	}
}
