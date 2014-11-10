package de.i3mainz.flexgeo.portal.liferay.springframework.xd.services.service;

import org.springframework.hateoas.PagedResources;
import org.springframework.xd.rest.domain.ModuleDefinitionResource;
import org.springframework.xd.rest.domain.RESTModuleType;
import org.springframework.xd.rest.domain.StreamDefinitionResource;

public interface SpringXDAdminService {
	PagedResources<StreamDefinitionResource> getStreams();
	PagedResources<ModuleDefinitionResource> getModules(RESTModuleType type);
	void startStream(String name);
	void stopStream(String name);
	StreamDefinitionResource addStream(String name, String definition,
			boolean start);
	void deleteStream(String name);
}
