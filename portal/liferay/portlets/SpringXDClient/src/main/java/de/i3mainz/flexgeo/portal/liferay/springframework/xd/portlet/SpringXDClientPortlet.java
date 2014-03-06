package de.i3mainz.flexgeo.portal.liferay.springframework.xd.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.hateoas.PagedResources;
import org.springframework.xd.rest.client.domain.ModuleDefinitionResource;
import org.springframework.xd.rest.client.domain.RESTModuleType;
import org.springframework.xd.rest.client.domain.StreamDefinitionResource;
import org.springframework.xd.rest.client.domain.XDRuntime;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import de.i3mainz.flexgeo.portal.liferay.springframework.xd.services.service.SpringXDAdminService;
import de.i3mainz.flexgeo.portal.liferay.springframework.xd.services.service.impl.SpringXDAdminServiceImpl;

public class SpringXDClientPortlet extends MVCPortlet {
	
	private static Log LOG = LogFactoryUtil
			.getLog(SpringXDClientPortlet.class);
	
	private SpringXDAdminService xdAdminService = new SpringXDAdminServiceImpl("http://localhost:9393/");

	/* (non-Javadoc)
	 * @see com.liferay.util.bridges.mvc.MVCPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		PagedResources<ModuleDefinitionResource> modulePagedResources =  xdAdminService.getModules(RESTModuleType.sink);
		renderRequest.setAttribute("spring-xd-modules", modulePagedResources);
		
		PagedResources<StreamDefinitionResource> streams =  xdAdminService.getStreams();
		List<StreamDefinitionResource> streamList = new ArrayList<StreamDefinitionResource>(streams.getContent());
		renderRequest.setAttribute("spring-xd-createdStreams", streamList);
		
		super.doView(renderRequest, renderResponse);
	}
	
	@ProcessAction(name = "editStream")
	public void editStream(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		LOG.info("editStream: Hier kommt was an.");
		String cmd = ParamUtil.getString(actionRequest, Constants.CMD);
		LOG.info("Das ist mein Command: "+cmd);
		String name = ParamUtil.getString(actionRequest, "streamId");
		
		if(name!=null && !name.isEmpty()){
			if(cmd.equals(Constants.RESTORE)) {
				xdAdminService.startStream(name);
			}else if(cmd.equals(Constants.DEACTIVATE)) {
				xdAdminService.stopStream(name);
			}else if (cmd.equals(Constants.DELETE)) {
				xdAdminService.deleteStream(name);
			}
		}else if (cmd.equals(Constants.ADD)) {
			String titel = ParamUtil.getString(actionRequest, "name");
			String definition = ParamUtil.getString(actionRequest, "definition");
			boolean startStream = ParamUtil.getBoolean(actionRequest, "startFlag",false);
			LOG.info("Titel: "+titel+"; Definition: "+definition);
			LOG.info("Hier kann jetzt hinzugefügt werden");
			xdAdminService.addStream(titel, definition, startStream);
		}
		
	
	}

}
