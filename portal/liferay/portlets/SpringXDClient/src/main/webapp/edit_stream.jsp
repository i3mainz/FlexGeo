<%@ include file="init.jsp"%>

<portlet:renderURL var="backURL">
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<liferay-ui:header backURL="<%=backURL%>" localizeTitle="<%=true%>"
	title='<%=(true) ? "new-springxd-stream"
					: "Hier steht der Stream-Title"%>' />

<portlet:actionURL var="editStreamURL" name="editStream">
	<portlet:param name="mvcPath" value="/edit_stream.jsp" />
</portlet:actionURL>

<aui:form action="<%=editStreamURL%>"
	method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden"
		value="<%=(true) ? Constants.ADD : Constants.UPDATE%>" />
	<aui:fieldset>
		<aui:input name="name" label="Titel" />
		<aui:input name="definition" label="Definition" />

		<aui:button-row>
			<aui:button name="publishButton" type="submit"
				value="save" />
			<aui:button href="<%=backURL%>" name="cancelButton" type="cancel" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>