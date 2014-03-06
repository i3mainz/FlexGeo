
<%
	Entry<Integer, OLMapsLayer> layerEntry = itr.next();
	int i_count = layerEntry.getKey().intValue();
	layerEntry.getValue().getName().toString();
	String layerobjecttypname = "Layer" + i_count;
	String layerswitcherLayerPanelId = renderResponse.getNamespace()
			+ "layer_" + i_count + "_" + layerobjecttypname + "_"
			+ i_count;
	String transparencySliderId = renderResponse.getNamespace()
			+ "layer_" + i_count + "_" + layerobjecttypname + "_"
			+ i_count + "_transparency";
	String layerswitcherLayerTitel = layerswitcherLayerPanelId
			+ "_title";
	String panelContainer = layerswitcherLayerPanelId+"_PanelContainer";
	String panelContainerInner = panelContainer+"_inner";
	String transparenzpanel = layerswitcherLayerPanelId+"_transparenzpanel";
	String legendepanel = layerswitcherLayerPanelId+"_legendepanel";
	String deleteURL = "javascript:"+renderResponse.getNamespace()+"deleteLayer("+i_count+")";
	String activateURL = "javascript:"+renderResponse.getNamespace()+"changeLayerSetting("+i_count+",\"visibility\",true)";
	String deactivateURL = "javascript:"+renderResponse.getNamespace()+"changeLayerSetting("+i_count+",\"visibility\",false)";
%>

<li class="layerswitcher_layer_list">
	<div id="<%=layerswitcherLayerPanelId%>"
		class="layer-management-layercontainer">
			<liferay-ui:panel collapsible="<%=true%>" defaultState="closed"
				extended="<%=true%>" id="<%=layerswitcherLayerTitel%>"
				persistState="<%=true%>" title="<%=layerEntry.getValue().getName().toString()%>">

				<div>
					<span><%=layerEntry.getValue().getDescription().toString()%></span>
				</div>
				<liferay-ui:panel-container extended="<%=true%>"
					id="<%=panelContainerInner%>" persistState="<%=true%>">
					<liferay-ui:panel collapsible="<%=true%>" defaultState="open"
						extended="<%=true%>"
						id='<%=transparenzpanel%>'
						persistState="<%=true%>" title="Transparenz">

						<div id="<%=transparencySliderId%>"></div>
					</liferay-ui:panel>
					<liferay-ui:panel collapsible="<%=true%>" defaultState="closed"
						extended="<%=true%>"
						id='<%=legendepanel%>'
						persistState="<%=true%>" title="Legende">

					</liferay-ui:panel>
				</liferay-ui:panel-container>
			</liferay-ui:panel>
		<c:if test="<%=true%>">
			<aui:nav-bar>
				<aui:nav>
					<liferay-ui:icon image="delete" url='<%=deleteURL%>' />
				</aui:nav>
				<aui:nav>
					<liferay-ui:icon id='<%=layerobjecttypname+"_deactivateicon" %>' image="deactivate" url='<%=deactivateURL%>' />
					<liferay-ui:icon id='<%=layerobjecttypname+"_activateicon" %>' image="activate" url='<%=activateURL%>'/>
				</aui:nav>
			</aui:nav-bar>
		</c:if>
	</div>
</li>
<aui:script use="slider">
	var slider = new A.Slider({
		min:0,
		max:100,
		value:<%=layerEntry.getValue().getOpacity()%>,
		length:'150px'								
   	}).render('#<%=transparencySliderId%>');
   				
   	slider.on('thumbMove', function(evt){
		var opacity = evt.currentTarget.getValue();
 		Liferay.fire('LayerSettingChanged',{
			key: "opacity",
			value: opacity,
			layerID: <%=i_count%>
		});
   	});        				
</aui:script>
<aui:script use="aui-editable-deprecated">
	new A.Editable({
		node: '#<%=layerswitcherLayerTitel%> .title-text',
		eventType: 'dblclick',
		after: {
			save: function() {
            	alert("Changed");
           	}
        }
	});
</aui:script>
<aui:script use="aui-base,aui-node">

	var activateicon = A.one('#<%=layerobjecttypname+"_activateicon" %>').get('parentNode').get('parentNode');
	var deactivateicon = A.one('#<%=layerobjecttypname+"_deactivateicon" %>').get('parentNode').get('parentNode');
	if(true){
		console.log("ES ist true");
		activateicon.hide();
		deactivateicon.show();
	}else{
		console.log("ES ist false");
		deactivateicon.hide();
		activateicon.show();
	}
	
</aui:script>