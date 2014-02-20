<%
	String layerobjecttypname = "Layer"+i_count;
	String layerswitcherLayerPanelId = renderResponse.getNamespace()+"layer_"+i_count+"_"+layerobjecttypname+"_"+i_count;
	String transparencySliderId = renderResponse.getNamespace()+"layer_"+i_count+"_"+layerobjecttypname+"_"+i_count+"_transparency";
	String layerswitcherLayerTitel = layerswitcherLayerPanelId+"_title";
%>

	<li class="layerswitcher_layer_list">
		<div id="<%=layerswitcherLayerPanelId%>">
			<div style="float:left;">
				<span id="<%=layerswitcherLayerTitel %>"><!-- Layer<%=i_count %>-->Twitter Merkel</span>
			</div>
			<div class="header toggler-header-collapsed" style="float:right;">
				<span><liferay-ui:icon image="maximize" /></span>
			</div>
			<div style="clear:both"></div>
			<div class="content toggler-content-collapsed">
				<div>
					<span>Hier bekommt die Beschreibung</span>
				</div>
				<div>
					<div class="header toggler-header-collapsed">Transparenz</div>
					<div class="content toggler-content-collapsed">
						<div id="<%=transparencySliderId %>"></div>
						<aui:script use="slider">
							new A.Slider({
								min:0,
								max:100,
								value:70,
								length:'250px'
	        				}).render('#<%=transparencySliderId %>');
						</aui:script>
						<aui:script use="aui-editable-deprecated">
							new A.Editable({
								node: '#<%=layerswitcherLayerTitel %>',
								eventType: 'dblclick',
								after: {
		                			save: function() {
		                    			alert("Changed");
		               	 			}
		            			}
							});
						</aui:script>
					
					</div>
				</div>
				<div class="header toggler-header-collapsed">Legende</div>
				<div class="content toggler-content-collapsed"></div>
			</div>
			<div>
				Und hier die Toolbar
			</div>
		</div>
	</li>