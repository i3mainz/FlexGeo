<div class="layerswitcher_container_scroll">
	<aui:button name="addButton" type="image" value="add"
		onClick='<%=renderResponse.getNamespace() + "showLayerCreator();"%>' />
	<div id="<%=renderResponse.getNamespace() + "layerswitcherwrapper"%>">
		<liferay-ui:panel-container extended="<%=true%>"
			id="<portlet:namespace/>layerSwitcherPanelContainer" persistState="<%=true%>">
			<ul id="<portlet:namespace/>layerswitcher" class="layerswitcher">
				<%
					for (Iterator<Entry<Integer,OLMapsLayer>> itr = layers.entrySet().iterator(); itr.hasNext();) {
					//for(int i_count=0; i_count<2; i_count++){
				%>
				<%@ include file="/layer-management/view_layer.jsp"%>
				<%
					}
				%>
			</ul>
		</liferay-ui:panel-container>
	</div>
</div>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace />updateLayerList',
		function() {
			A = AUI();
			console.log("AJAX");
			new A.SortableList({
				dropCondition: function(event){
					console.log('DROP');
					console.log(event);
					return true;
				},
				dropOn:'<portlet:namespace />layerswitcher',
				nodes:'#<portlet:namespace />layerswitcher li',
			});
			
			new A.TogglerDelegate({
        		container: '#<portlet:namespace />layerswitcherwrapper',
        		content: '.content',
        		header: '.header',
        		expanded: false,
        		closeAllOnExpand: false,
        		animated: true,
        		transition: {
          			duration: 0.2,
          			easing: 'cubic-bezier'
        		}
   			});
		},
		['aui-sortable-list','aui-toggler']
	);
	
	Liferay.provide(
		window,
		'<portlet:namespace />changeLayerSetting',
		function(layerID, parameter, value) {
			A = AUI();
			var layerobjecttypname = "Layer" + layerID;
			var activeiconRef = '#<portlet:namespace />'+layerobjecttypname+"_activateicon";
			var deactiveiconRef = '#<portlet:namespace />'+layerobjecttypname+"_deactivateicon";
			if(parameter == "visibility"){
				var activateicon = A.one(activeiconRef).get('parentNode');
				var deactivateicon = A.one(deactiveiconRef).get('parentNode');
				if(value==true){
					activateicon.hide();
					deactivateicon.show();
				}else{
					deactivateicon.hide();
					activateicon.show();
				}
			}
			Liferay.fire('LayerSettingChanged',{
					key: parameter,
					value: value,
					layerID: layerID
			});
		},
		['aui-node','aui-base']
	);
	
	Liferay.provide(
		window,
		'<portlet:namespace />deleteLayer',
		function(layerID) {
			A = AUI();
			console.log("DELETE LAYER");
			console.log(layerID);
		},
		[]
	);
</aui:script>