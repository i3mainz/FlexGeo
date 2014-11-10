<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

<%@ include file="init.jsp" %>

<%
SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
String redirect = searchContainer.getIteratorURL().toString();
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
StreamDefinitionResource stream = (StreamDefinitionResource)row.getObject();

%>

<liferay-ui:icon-menu>
	<c:if
		test="<%=(true)%>">
		<c:choose>
			<c:when test="<%=stream.getStatus().equalsIgnoreCase(\"deployed\")%>">
				<portlet:actionURL var="deactivateEntryURL" name="editStream">
					<portlet:param name="mvcPath" value="edit_stream.jsp" />
					<portlet:param name="<%=Constants.CMD%>"
						value="<%=Constants.DEACTIVATE%>" />
					<portlet:param name="redirect" value="<%=redirect%>" />
					<portlet:param name="streamId"
						value="<%=String.valueOf(stream.getName())%>" />
				</portlet:actionURL>
				<liferay-ui:icon-deactivate url="<%=deactivateEntryURL%>" />
			</c:when>
			<c:when test="<%=stream.getStatus().equalsIgnoreCase(\"undeployed\")%>">
				<portlet:actionURL var="activateEntryURL" name="editStream">
					<portlet:param name="mvcPath" value="edit_stream.jsp" />
					<portlet:param name="<%=Constants.CMD%>"
						value="<%=Constants.RESTORE%>" />
					<portlet:param name="redirect" value="<%=redirect%>" />
					<portlet:param name="streamId"
						value="<%=String.valueOf(stream.getName())%>" />
				</portlet:actionURL>

				<liferay-ui:icon image="activate" url="<%=activateEntryURL%>" />
			</c:when>
		</c:choose>
	</c:if>
	<c:if
		test="<%=true%>">
		<portlet:actionURL var="deleteEntryURL" name="editStream">
			<portlet:param name="mvcPath" value="edit_stream.jsp" />
			<portlet:param name="<%=Constants.CMD%>"
				value="<%=Constants.DELETE%>" />
			<portlet:param name="redirect" value="<%=redirect%>" />
			<portlet:param name="streamId"
				value="<%=String.valueOf(stream.getName())%>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%= deleteEntryURL %>" />
	</c:if>
</liferay-ui:icon-menu>