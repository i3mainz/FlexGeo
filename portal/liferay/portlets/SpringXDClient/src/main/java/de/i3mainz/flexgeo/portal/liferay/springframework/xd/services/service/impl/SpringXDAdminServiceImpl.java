package de.i3mainz.flexgeo.portal.liferay.springframework.xd.services.service.impl;

import java.net.URI;

import org.springframework.hateoas.PagedResources;
import org.springframework.xd.rest.client.SpringXDOperations;
import org.springframework.xd.rest.client.domain.ModuleDefinitionResource;
import org.springframework.xd.rest.client.domain.RESTModuleType;
import org.springframework.xd.rest.client.domain.StreamDefinitionResource;
import org.springframework.xd.rest.client.impl.SpringXDTemplate;

import de.i3mainz.flexgeo.portal.liferay.springframework.xd.services.service.SpringXDAdminService;

public class SpringXDAdminServiceImpl implements SpringXDAdminService {
	
	private SpringXDOperations xdOps;
	
	public SpringXDAdminServiceImpl(String url) {
		this(URI.create(url));
	}
	
	public SpringXDAdminServiceImpl(URI uri) {
		xdOps = new SpringXDTemplate(uri);
	}

	@Override
	public PagedResources<StreamDefinitionResource> getStreams() {
		return xdOps.streamOperations().list();
	}

	@Override
	public PagedResources<ModuleDefinitionResource> getModules(
			RESTModuleType type) {
		return xdOps.moduleOperations().list(type);
	}

	@Override
	public void startStream(String name) {
		xdOps.streamOperations().deploy(name);	
	}

	@Override
	public void stopStream(String name) {
		xdOps.streamOperations().undeploy(name);
	}

	@Override
	public StreamDefinitionResource addStream(String name, String definition, boolean start) {
		return xdOps.streamOperations().createStream(name, definition, start);
	}

	@Override
	public void deleteStream(String name) {
		xdOps.streamOperations().destroy(name);
	}

}
