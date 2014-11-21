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

<%@page import="com.liferay.portal.service.LayoutLocalServiceUtil"%>
<%@ include file="init.jsp"%>

<%
    SearchContainer searchContainer = (SearchContainer) request
            .getAttribute("liferay-ui:search:searchContainer");
    String redirect = searchContainer.getIteratorURL().toString();
    ResultRow row = (ResultRow) request
            .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    Report report = (Report) row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test="<%=(true)%>">
		<c:choose>
			<c:when
				test="<%=!report.isActive()
                                    && report.getCount() > 0%>">
				<portlet:actionURL var="addReportPageURL" name="addReportPage">
					<portlet:param name="mvcPath" value="view.jsp" />
					<portlet:param name="<%=Constants.CMD%>" value="<%=Constants.ADD%>" />
					<portlet:param name="redirect" value="<%=redirect%>" />
					<portlet:param name="reportID"
						value="<%=String.valueOf(report.getId())%>" />
				</portlet:actionURL>
				<liferay-ui:icon image="add" url="<%=addReportPageURL%>" />
			</c:when>
			<c:when test="<%=report.isActive()%>">
				<liferay-ui:icon image="view"
					url="<%=themeDisplay.getPortalURL()
                                    + themeDisplay.getScopeGroup()
                                            .getPathFriendlyURL(false,
                                                    themeDisplay)
                                    + themeDisplay.getLayout().getGroup()
                                            .getFriendlyURL()
                                    + LayoutLocalServiceUtil.getLayout(
                                            report.getReportPlid())
                                            .getFriendlyURL()%>" />

				<c:if test="<%=true%>">
					<portlet:actionURL var="deleteReportPageURL"
						name="removeReportPage">
						<portlet:param name="mvcPath" value="view.jsp" />
						<portlet:param name="<%=Constants.CMD%>"
							value="<%=Constants.DELETE%>" />
						<portlet:param name="redirect" value="<%=redirect%>" />
						<portlet:param name="reportID"
							value="<%=String.valueOf(report.getId())%>" />
					</portlet:actionURL>

					<liferay-ui:icon-delete url="<%=deleteReportPageURL%>" />
				</c:if>
			</c:when>
		</c:choose>
	</c:if>
</liferay-ui:icon-menu>