<div class="layerswitcher_container_scroll">
	<aui:button name="addButton" type="image" value="add" onClick='<%=renderResponse.getNamespace()+"showLayerCreator();"%>' />
	<div id="<%=renderResponse.getNamespace()+"layerswitcherwrapper"%>">
		<ul id="<portlet:namespace/>layerswitcher"
			class="layerswitcher">
			<%
				for(int i_count=0; i_count <3; i_count++){
					%>
					<%@ include file="/layer-management/view_layer.jsp" %>
					<%
				}
			%>
		</ul>
	</div>
</div>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace/>updateLayerList',
		function() {
			A = AUI();
			console.log("AJAX");
			new A.SortableList({
				dropCondition: function(event){
					return true;
				},
				dropOn:'<portlet:namespace/>layerswitcher',
				nodes:'#<portlet:namespace/>layerswitcher li',
			});
			
			new A.TogglerDelegate({
        		container: '#<portlet:namespace/>layerswitcherwrapper',
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
</aui:script>