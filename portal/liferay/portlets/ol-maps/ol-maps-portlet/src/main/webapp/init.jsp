<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="javax.portlet.ResourceURL"%>
<%@ page import="javax.portlet.RenderResponse"%>
<%@ page import="com.liferay.util.portlet.PortletProps" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@ page import="com.liferay.portal.kernel.language.LanguageWrapper" %>
<%@ page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	ResourceURL currentResUrl = renderResponse.createResourceURL();
	String geoserverurl = PortletProps.get("goancontrol.geoserver.url");
	if(geoserverurl==null || geoserverurl.equals("")){
		geoserverurl="http://localhost/geoserver";
	}
	
	Long reportID = (Long)themeDisplay.getLayout()
			.getExpandoBridge().getAttribute("reportID");
	
	//System.out.println("Aktueller Geoserver im LayerSwitcher-Portlet: " + geoserverurl);
%>