<%@include file="init.jsp"%>

<%
	List<StreamDefinitionResource> streams = (List<StreamDefinitionResource>)renderRequest.getAttribute("spring-xd-createdStreams");
%>

<liferay-util:include page="/toolbar.jsp"
	servletContext="<%=this.getServletContext()%>">
	<liferay-util:param name="toolbarItem" value="view-all" />
</liferay-util:include>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-users-were-found">
	<liferay-ui:search-container-results
		results="<%=streams %>"
		total="<%= streams.size() %>"
	/>

	<liferay-ui:search-container-row
		className="org.springframework.xd.rest.domain.StreamDefinitionResource"
		keyProperty="name"
		modelVar="stream"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= stream.getName() %>"
		/>

		<liferay-ui:search-container-column-text
			name="definition"
			value="<%= stream.getDefinition() %>"
		/>
		
		<liferay-ui:search-container-column-text
			name="Running">
			<c:choose>
				<c:when test="<%=stream.getStatus().equalsIgnoreCase(\"deployed\")%>">
					<liferay-ui:icon image="activate" />
				</c:when>
				<c:otherwise>
					<liferay-ui:icon image="deactivate" />
				</c:otherwise>
		</c:choose>
		</liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp align="right"
					path="/entry_action.jsp" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>