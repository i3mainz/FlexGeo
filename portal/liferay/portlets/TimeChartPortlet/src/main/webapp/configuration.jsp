<%@ include file="init.jsp"%>

<liferay-portlet:actionURL portletConfiguration="true"
	var="configurationURL" />

<aui:form action="<%=configurationURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" /> 
	<liferay-ui:panel-container extended="<%=true%>" id="PanelContainer"
		persistState="<%=true%>">
		<liferay-ui:panel collapsible="<%=true%>" defaultState="open"
			extended="<%=true%>" id="preferences" persistState="<%=true%>"
			title="basic-setup">
			<aui:fieldset>
				<aui:select helpMessage="aggr-precision-help" label="Genauigkeit der Aggregation"
					name="preferences--aggregationprecision--">
					<aui:option label="Year"
						selected="<%=aggrprecision == Calendar.YEAR%>"
						value="<%=Calendar.YEAR%>" />
					<aui:option label="Month"
						selected="<%=aggrprecision == Calendar.MONTH%>"
						value="<%=Calendar.MONTH%>" />
					<aui:option label="Week"
						selected="<%=aggrprecision == Calendar.WEEK_OF_YEAR%>"
						value="<%=Calendar.WEEK_OF_YEAR%>" />
					<aui:option label="Day"
						selected="<%=aggrprecision == Calendar.DAY_OF_MONTH%>"
						value="<%=Calendar.DAY_OF_MONTH%>" />
					<aui:option label="Hour"
						selected="<%=aggrprecision == Calendar.HOUR_OF_DAY%>"
						value="<%=Calendar.HOUR_OF_DAY%>" />
					<aui:option label="Minute"
						selected="<%=aggrprecision == Calendar.MINUTE%>"
						value="<%=Calendar.MINUTE%>" />
				</aui:select>
			</aui:fieldset>
		</liferay-ui:panel>
	</liferay-ui:panel-container>
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>