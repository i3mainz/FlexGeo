<%@page import="java.util.Collection"%>
<%@include file="init.jsp"%>

<%
    List<Report> themen = (List<Report>)renderRequest.getAttribute("tweetmap-reports");
%>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-users-were-found">
	<liferay-ui:search-container-results
		results="<%=themen %>"
		total="<%= themen.size() %>"
	/>

	<liferay-ui:search-container-row
		className="de.i3mainz.flexgeo.portal.liferay.reports.portlets.model.Report"
		keyProperty="id"
		modelVar="thema"
	>
		<liferay-ui:search-container-column-text
			name="ID"
			value="<%= String.valueOf(thema.getId()) %>"
		/>

		<liferay-ui:search-container-column-text
			name="Titel"
			value="<%= thema.getTitel() %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="Anzahl Tweets" 
			value="<%= String.valueOf(thema.getCount()) %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="Suchinterval" 
			value="<%= thema.getDatum() %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="Search-Status" 
			value="<%= String.valueOf(thema.isStatus()) %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="Report Seite verfügbar" 
			value="<%= String.valueOf(thema.isActive()) %>"
		/>
		
		<liferay-ui:search-container-column-jsp align="right"
					path="/entry_action.jsp" />
					
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

