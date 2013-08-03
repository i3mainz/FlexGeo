package de.i3mainz.flexgeo.portal.liferay.services.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.CompanyLocalService;
import com.liferay.portal.service.CompanyService;
import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupService;
import com.liferay.portal.service.OrganizationLocalService;
import com.liferay.portal.service.OrganizationService;
import com.liferay.portal.service.PortletPreferencesLocalService;
import com.liferay.portal.service.PortletPreferencesService;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.CompanyPersistence;
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.OrganizationPersistence;
import com.liferay.portal.service.persistence.PortletPreferencesPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import de.i3mainz.flexgeo.portal.liferay.services.model.OGCServiceLayer;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerLocalService;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerService;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLocalService;
import de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceService;
import de.i3mainz.flexgeo.portal.liferay.services.service.persistence.OGCServiceLayerPersistence;
import de.i3mainz.flexgeo.portal.liferay.services.service.persistence.OGCServicePersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the o g c service layer remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceLayerServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.impl.OGCServiceLayerServiceImpl
 * @see de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerServiceUtil
 * @generated
 */
public abstract class OGCServiceLayerServiceBaseImpl extends BaseServiceImpl
    implements OGCServiceLayerService, IdentifiableBean {
    @BeanReference(type = OGCServiceLocalService.class)
    protected OGCServiceLocalService ogcServiceLocalService;
    @BeanReference(type = OGCServiceService.class)
    protected OGCServiceService ogcServiceService;
    @BeanReference(type = OGCServicePersistence.class)
    protected OGCServicePersistence ogcServicePersistence;
    @BeanReference(type = OGCServiceLayerLocalService.class)
    protected OGCServiceLayerLocalService ogcServiceLayerLocalService;
    @BeanReference(type = OGCServiceLayerService.class)
    protected OGCServiceLayerService ogcServiceLayerService;
    @BeanReference(type = OGCServiceLayerPersistence.class)
    protected OGCServiceLayerPersistence ogcServiceLayerPersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = CompanyLocalService.class)
    protected CompanyLocalService companyLocalService;
    @BeanReference(type = CompanyService.class)
    protected CompanyService companyService;
    @BeanReference(type = CompanyPersistence.class)
    protected CompanyPersistence companyPersistence;
    @BeanReference(type = GroupLocalService.class)
    protected GroupLocalService groupLocalService;
    @BeanReference(type = GroupService.class)
    protected GroupService groupService;
    @BeanReference(type = GroupPersistence.class)
    protected GroupPersistence groupPersistence;
    @BeanReference(type = OrganizationLocalService.class)
    protected OrganizationLocalService organizationLocalService;
    @BeanReference(type = OrganizationService.class)
    protected OrganizationService organizationService;
    @BeanReference(type = OrganizationPersistence.class)
    protected OrganizationPersistence organizationPersistence;
    @BeanReference(type = PortletPreferencesLocalService.class)
    protected PortletPreferencesLocalService portletPreferencesLocalService;
    @BeanReference(type = PortletPreferencesService.class)
    protected PortletPreferencesService portletPreferencesService;
    @BeanReference(type = PortletPreferencesPersistence.class)
    protected PortletPreferencesPersistence portletPreferencesPersistence;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private OGCServiceLayerServiceClpInvoker _clpInvoker = new OGCServiceLayerServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link de.i3mainz.flexgeo.portal.liferay.services.service.OGCServiceLayerServiceUtil} to access the o g c service layer remote service.
     */

    /**
     * Returns the o g c service local service.
     *
     * @return the o g c service local service
     */
    public OGCServiceLocalService getOGCServiceLocalService() {
        return ogcServiceLocalService;
    }

    /**
     * Sets the o g c service local service.
     *
     * @param ogcServiceLocalService the o g c service local service
     */
    public void setOGCServiceLocalService(
        OGCServiceLocalService ogcServiceLocalService) {
        this.ogcServiceLocalService = ogcServiceLocalService;
    }

    /**
     * Returns the o g c service remote service.
     *
     * @return the o g c service remote service
     */
    public OGCServiceService getOGCServiceService() {
        return ogcServiceService;
    }

    /**
     * Sets the o g c service remote service.
     *
     * @param ogcServiceService the o g c service remote service
     */
    public void setOGCServiceService(OGCServiceService ogcServiceService) {
        this.ogcServiceService = ogcServiceService;
    }

    /**
     * Returns the o g c service persistence.
     *
     * @return the o g c service persistence
     */
    public OGCServicePersistence getOGCServicePersistence() {
        return ogcServicePersistence;
    }

    /**
     * Sets the o g c service persistence.
     *
     * @param ogcServicePersistence the o g c service persistence
     */
    public void setOGCServicePersistence(
        OGCServicePersistence ogcServicePersistence) {
        this.ogcServicePersistence = ogcServicePersistence;
    }

    /**
     * Returns the o g c service layer local service.
     *
     * @return the o g c service layer local service
     */
    public OGCServiceLayerLocalService getOGCServiceLayerLocalService() {
        return ogcServiceLayerLocalService;
    }

    /**
     * Sets the o g c service layer local service.
     *
     * @param ogcServiceLayerLocalService the o g c service layer local service
     */
    public void setOGCServiceLayerLocalService(
        OGCServiceLayerLocalService ogcServiceLayerLocalService) {
        this.ogcServiceLayerLocalService = ogcServiceLayerLocalService;
    }

    /**
     * Returns the o g c service layer remote service.
     *
     * @return the o g c service layer remote service
     */
    public OGCServiceLayerService getOGCServiceLayerService() {
        return ogcServiceLayerService;
    }

    /**
     * Sets the o g c service layer remote service.
     *
     * @param ogcServiceLayerService the o g c service layer remote service
     */
    public void setOGCServiceLayerService(
        OGCServiceLayerService ogcServiceLayerService) {
        this.ogcServiceLayerService = ogcServiceLayerService;
    }

    /**
     * Returns the o g c service layer persistence.
     *
     * @return the o g c service layer persistence
     */
    public OGCServiceLayerPersistence getOGCServiceLayerPersistence() {
        return ogcServiceLayerPersistence;
    }

    /**
     * Sets the o g c service layer persistence.
     *
     * @param ogcServiceLayerPersistence the o g c service layer persistence
     */
    public void setOGCServiceLayerPersistence(
        OGCServiceLayerPersistence ogcServiceLayerPersistence) {
        this.ogcServiceLayerPersistence = ogcServiceLayerPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the company local service.
     *
     * @return the company local service
     */
    public CompanyLocalService getCompanyLocalService() {
        return companyLocalService;
    }

    /**
     * Sets the company local service.
     *
     * @param companyLocalService the company local service
     */
    public void setCompanyLocalService(CompanyLocalService companyLocalService) {
        this.companyLocalService = companyLocalService;
    }

    /**
     * Returns the company remote service.
     *
     * @return the company remote service
     */
    public CompanyService getCompanyService() {
        return companyService;
    }

    /**
     * Sets the company remote service.
     *
     * @param companyService the company remote service
     */
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    /**
     * Returns the company persistence.
     *
     * @return the company persistence
     */
    public CompanyPersistence getCompanyPersistence() {
        return companyPersistence;
    }

    /**
     * Sets the company persistence.
     *
     * @param companyPersistence the company persistence
     */
    public void setCompanyPersistence(CompanyPersistence companyPersistence) {
        this.companyPersistence = companyPersistence;
    }

    /**
     * Returns the group local service.
     *
     * @return the group local service
     */
    public GroupLocalService getGroupLocalService() {
        return groupLocalService;
    }

    /**
     * Sets the group local service.
     *
     * @param groupLocalService the group local service
     */
    public void setGroupLocalService(GroupLocalService groupLocalService) {
        this.groupLocalService = groupLocalService;
    }

    /**
     * Returns the group remote service.
     *
     * @return the group remote service
     */
    public GroupService getGroupService() {
        return groupService;
    }

    /**
     * Sets the group remote service.
     *
     * @param groupService the group remote service
     */
    public void setGroupService(GroupService groupService) {
        this.groupService = groupService;
    }

    /**
     * Returns the group persistence.
     *
     * @return the group persistence
     */
    public GroupPersistence getGroupPersistence() {
        return groupPersistence;
    }

    /**
     * Sets the group persistence.
     *
     * @param groupPersistence the group persistence
     */
    public void setGroupPersistence(GroupPersistence groupPersistence) {
        this.groupPersistence = groupPersistence;
    }

    /**
     * Returns the organization local service.
     *
     * @return the organization local service
     */
    public OrganizationLocalService getOrganizationLocalService() {
        return organizationLocalService;
    }

    /**
     * Sets the organization local service.
     *
     * @param organizationLocalService the organization local service
     */
    public void setOrganizationLocalService(
        OrganizationLocalService organizationLocalService) {
        this.organizationLocalService = organizationLocalService;
    }

    /**
     * Returns the organization remote service.
     *
     * @return the organization remote service
     */
    public OrganizationService getOrganizationService() {
        return organizationService;
    }

    /**
     * Sets the organization remote service.
     *
     * @param organizationService the organization remote service
     */
    public void setOrganizationService(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    /**
     * Returns the organization persistence.
     *
     * @return the organization persistence
     */
    public OrganizationPersistence getOrganizationPersistence() {
        return organizationPersistence;
    }

    /**
     * Sets the organization persistence.
     *
     * @param organizationPersistence the organization persistence
     */
    public void setOrganizationPersistence(
        OrganizationPersistence organizationPersistence) {
        this.organizationPersistence = organizationPersistence;
    }

    /**
     * Returns the portlet preferences local service.
     *
     * @return the portlet preferences local service
     */
    public PortletPreferencesLocalService getPortletPreferencesLocalService() {
        return portletPreferencesLocalService;
    }

    /**
     * Sets the portlet preferences local service.
     *
     * @param portletPreferencesLocalService the portlet preferences local service
     */
    public void setPortletPreferencesLocalService(
        PortletPreferencesLocalService portletPreferencesLocalService) {
        this.portletPreferencesLocalService = portletPreferencesLocalService;
    }

    /**
     * Returns the portlet preferences remote service.
     *
     * @return the portlet preferences remote service
     */
    public PortletPreferencesService getPortletPreferencesService() {
        return portletPreferencesService;
    }

    /**
     * Sets the portlet preferences remote service.
     *
     * @param portletPreferencesService the portlet preferences remote service
     */
    public void setPortletPreferencesService(
        PortletPreferencesService portletPreferencesService) {
        this.portletPreferencesService = portletPreferencesService;
    }

    /**
     * Returns the portlet preferences persistence.
     *
     * @return the portlet preferences persistence
     */
    public PortletPreferencesPersistence getPortletPreferencesPersistence() {
        return portletPreferencesPersistence;
    }

    /**
     * Sets the portlet preferences persistence.
     *
     * @param portletPreferencesPersistence the portlet preferences persistence
     */
    public void setPortletPreferencesPersistence(
        PortletPreferencesPersistence portletPreferencesPersistence) {
        this.portletPreferencesPersistence = portletPreferencesPersistence;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
    }

    protected Class<?> getModelClass() {
        return OGCServiceLayer.class;
    }

    protected String getModelClassName() {
        return OGCServiceLayer.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = ogcServiceLayerPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
