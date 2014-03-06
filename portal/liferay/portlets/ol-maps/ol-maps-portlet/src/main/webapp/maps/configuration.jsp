<%@ include file="init.jsp"%>

<liferay-portlet:actionURL portletConfiguration="true"
	var="mapconfigurationURL" />

<aui:form action="<%=mapconfigurationURL%>" method="post" name="fmmap">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" /> 
	<liferay-ui:panel-container extended="<%=true%>" id="PanelContainer"
		persistState="<%=true%>">
		<liferay-ui:panel collapsible="<%=true%>" defaultState="open"
			extended="<%=true%>" id="preferences" persistState="<%=true%>"
			title="basic-setup">
			<aui:fieldset>
				<aui:select helpMessage="basismap-help" label="Basis-Karte"
					name="preferences--basismap--">
					<aui:option label="OSM"
						selected="<%=basismap == OLMapConstants.BASISMAP_OSM%>"
						value="<%=OLMapConstants.BASISMAP_OSM%>" />
<%-- 					<aui:option label="MapQuest-Hybrid" --%>
<%-- 						selected="<%=basismap == OLMapConstants.BASISMAP_MAPQUEST_FULL%>" --%>
<%-- 						value="<%=OLMapConstants.BASISMAP_MAPQUEST_FULL%>" /> --%>
					<aui:option label="MapQuest-OSM"
						selected="<%=basismap == OLMapConstants.BASISMAP_MAPQUEST_OSM%>"
						value="<%=OLMapConstants.BASISMAP_MAPQUEST_OSM%>" />
					<aui:option label="MapQuest-Satellit"
						selected="<%=basismap == OLMapConstants.BASISMAP_MAPQUEST_SAT%>"
						value="<%=OLMapConstants.BASISMAP_MAPQUEST_SAT%>" />
<%-- 					<aui:option label="Bing" --%>
<%-- 						selected="<%=basismap == OLMapConstants.BASISMAP_BING%>" --%>
<%-- 						value="<%=OLMapConstants.BASISMAP_BING%>" /> --%>
				</aui:select>
			</aui:fieldset>
		</liferay-ui:panel>
	</liferay-ui:panel-container>
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>