<%@ include file="init.jsp" %>

<portlet:renderURL var="viewStreamsURL">
		<portlet:param name="mvcPath" value="/view.jsp" />
	</portlet:renderURL>

<c:if test="<%=true%>">
	<aui:nav-bar>
		<aui:nav>
			<c:choose>
				<c:when test="<%=true%>">
				
					<portlet:renderURL var="addStreamURL">
						<portlet:param name="mvcPath" value="/edit_stream.jsp" />
						<portlet:param name="redirect" value="<%=viewStreamsURL%>" />
						<portlet:param name="backURL" value="<%=viewStreamsURL%>" />
					</portlet:renderURL>
					<aui:nav-item
						href="<%=addStreamURL%>"
						iconCssClass="icon-file"
						label='<%=LanguageUtil.format(pageContext,
										"add-x", "Stream",
										false)%>' />
				</c:when>
				<c:otherwise>
				</c:otherwise>
			</c:choose>
		</aui:nav>
	</aui:nav-bar>
</c:if>