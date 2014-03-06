package de.i3mainz.flexgeo.portal.liferay.olmaps.services.model.impl;

import java.util.Map;

public class OLMapsLayer {
	private String id;
	private String name;
	private String description;
	private int opacity;
	private String url;
	private Map<String, Object> params;
	
	
	public OLMapsLayer(String id, String name, String description, int opacity,
			String url, Map<String, Object> params) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setOpacity(opacity);
		this.setUrl(url);
		this.setParams(params);
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the opacity
	 */
	public int getOpacity() {
		return opacity;
	}
	/**
	 * @param opacity the opacity to set
	 */
	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the params
	 */
	public Map<String, Object> getParams() {
		return params;
	}
	/**
	 * @param params the params to set
	 */
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
