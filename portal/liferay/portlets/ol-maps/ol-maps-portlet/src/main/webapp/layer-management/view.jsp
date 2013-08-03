<%@ include file="init.jsp"%>
<%@ include file="switcher.jsp"%>

<portlet:renderURL var="layerCreatorPageURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="jspPage" value="/layer-creator/view.jsp"/>
	<portlet:param name="redirect" value="/layer-management/view.jsp"/>
</portlet:renderURL>

<aui:script>
	Liferay.provide(
		window,
		'<portlet:namespace/>showLayerCreator',
		function() {
			var instance = this;

			var url='<%= layerCreatorPageURL %>';

				Liferay.Util.openWindow(
					{
						cache: false,
						dialog: {
							align: Liferay.Util.Window.ALIGN_CENTER,
							after: {
								render: function(event) {
									this.set('y', this.get('y') + 50);
								}
							},
							width: 500,
							height: 300,
							zIndex: Liferay.zIndex.WINDOW + 20,
						},
						dialogIframe: {
							id: '<portlet:namespace/>layerCreatorIframe',
							uri: url
						},
						title: 'Layer Creator',
						uri: url
					}
				);
		},
		['liferay-util-window']
	);
	
	AUI().ready(
    	function() {
    		<%=renderResponse.getNamespace()+"updateLayerList();"%>
    	}
	);
</aui:script>