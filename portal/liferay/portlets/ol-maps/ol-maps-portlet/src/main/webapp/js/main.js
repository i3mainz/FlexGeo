panelContainer = new Array();
$('#<portlet:namespace/>layerswitcher').html("");
	
<%currentResUrl.setParameter("setParameter", "");%>
<%currentResUrl.setParameter("getParameter", "getLayers");%>
	
$.ajax({
	url: "<%=currentResUrl.toString()%>",
	dataType: "json",
	type: "GET",
	async: false,
	success: function( data ) {
		if(data!="" && data!=null){
			var result = data;
			res_layers = result;
	        for (i_count=0; i_count<result.layer.length; i_count++) {
	        	var layerobjekt = result.layer[i_count];
	        	var layerobjecttypname = layerobjekt.typ.name.replace(/\s+/g,"");
	        	$('#<portlet:namespace/>layerswitcher').append('<li class="layerswitcher_layer_list" id="<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'"><div class="" id="<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_nestedPanels"></div></li>');
	        	var bodyContent_layer = A.Node.create('<div class="nested-panels"></div>');
	        	var panel_content = '<input type="checkbox" value="aktiv"';
	        	if(layerobjekt.visibility){
	        		panel_content += 'checked="checked" ';
	        	}
	        	panel_content += 'onClick="javascript:<portlet:namespace/>checkChanged(this);" name="<portlet:namespace/>active_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'" id="<portlet:namespace/>active_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'" />&nbsp;<div id="<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_editTitelButton">'+layerobjekt.titel+'</div>('+layerobjekt.typ.name+')';
	        	panelContainer[i_count] = new A.Panel({
	        		collapsible: true,
	        		headerContent: panel_content ,
	        		bodyContent: bodyContent_layer,
	        		icons: [
	        		        {
	        		        	icon: 'circle-triangle-t',
	        		        	id: '<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_moveUp',
	        		        	handler: function (event) {
	        		        	}
	        		        },
	        		        {
	        		        	icon: 'circle-triangle-b',
	        		        	id: '<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_moveDown',
	        		        	handler: function (event) {
	        		        	}
	        		        },
	        		        {
	        		        	icon: 'close',
	        		        	// label: 'Entfernen',
	        		        	id: '<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_closeButton',
	        		        	handler: function(event) {
	        		        		if (confirm('<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-delete-confirm-text") %>')) {									
	        		        			<%currentResUrl.setParameter("setParameter", "deleteLayer");%>
	        		        			<%currentResUrl.setParameter("getParameter", "");%>
							
	        		        			var layerid = result.layer[event.currentTarget.get("id").replace(/<portlet:namespace/>layer/g,"").split("_")[1]].id;
							
	        		        			$.ajax({
	        		        				url: "<%=currentResUrl.toString()%>&layerid="+layerid,
	        		        				dataType: "json",
											type: "GET",
											async: false,
											success: function( data ) {
												if(data!="" && data!=null){
													  var result = data;
													  if (result.dataFor=="layerDeleted") {
														  if (result.message=="layer_deleted_success"){
															  // console.log("LAYER DELETE
																// FIRE");
															  Liferay.fire("layerDeleted",{
																  id: layerid
															  });
														  }
													  }
					  							}
											}
	        		        			});
							
	        		        			$('#'+this['_originalConfig'].id.substring(0,this['_originalConfig'].id.lastIndexOf("_closeButton"))).remove();
	        		        		}
	        		        	}
	        		        }
	        		        ]
	        	}).render('#<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_nestedPanels').collapse();

	        	var bodyContent_description = A.Node.create('<div id="<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_editDescriptionButton">'+layerobjekt.description+'</div>');

				var description = new A.Panel({
						collapsible: true,
						headerContent: '<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-header-description") %>',
						icons: [
						],
						bodyContent: bodyContent_description
				}).render(bodyContent_layer).collapse();

				var bodyContent_werkzeuge = A.Node.create('<div class="nested-panels"></div>');
				var bodyContent_transparency = A.Node.create('<div id="<portlet:namespace/>'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_transparency-slider"><div class="LayerSwitcher_transparency-slider" id="<portlet:namespace/>slider_'+layerobjekt.id+'"></div></div>');
				var bodyContent_colorchange = A.Node.create('<div id="<portlet:namespace/>'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_color-change"></div>');
				var bodyContent_layertypechange = A.Node.create('<div id="<portlet:namespace/>'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_layertype-change"></div>');

				var werkzeuge = new A.Panel({
					collapsible: true,
					headerContent: '<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-header-tools") %>',
					bodyContent: bodyContent_werkzeuge
				}).render(bodyContent_layer).collapse();


				var transparency_change = new A.Panel({
					collapsible: false,
					headerContent: '<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-header-config-opacity") %>',
					bodyContent: bodyContent_transparency
				}).render(bodyContent_werkzeuge);

				$('#<portlet:namespace/>slider_'+layerobjekt.id).slider({
					min: 0,
					max: 100,
					value: layerobjekt.transparency,
					change: function(event, ui) {
						var id = $(event.target).parent().attr('id');
						var idpieces = id.replace(/<portlet:namespace/>/g,"").split("_");
						var layerid = idpieces[idpieces.length-2];
						<portlet:namespace/>changeLayerOpacity(layerid, ui.value)
					}
				});

				// var transparency_slider = A.Slider("sliderbg", "sliderthumb", 100, 100);

				var transparency_buttons = new A.Toolbar({
					activeState: false,
					children:  [
					            {
					            	icon: 'circlesmall-minus',
					            	handler: function(event){
					            	}
					            },
					            {
					            	icon: 'circlesmall-plus',
					            	handler: function(event){
					            	}
					            }
					            ]
				});// .render(transparency_change.bodyNode);

				var type_change = new A.Panel({
						collapsible: false,
						headerContent: '<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-header-config-changelayertyp") %>',
						bodyContent: bodyContent_layertypechange
				})
				// .render(bodyContent_werkzeuge

				var color_change = new A.Pan({
						collapsible: fae,
						headerContent: '<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-header-config-changeColor") ',
						bodyContent: bodyContent_colorchge
				})
				// .render(bodyContent_werkzeuge);


				var legend = new A.Panel({
						collapsible: true,
						headerContent: '<%= LanguageUtil.get(pageContext, "layerswitcher-switcher-header-legend") %>',
						bodyContent: '<img src="<%=geoserverurl%>/wms?REQUEST=GetLegendGraphic&VERSION=1.0.0&FORMAT=image/png&WIDTH=35&HEIGHT=35&LAYER=L'+layerobjekt.id+'" border="0" />'
				}).render(bodyContent_layer);

				new A.Editable({
					node: '#<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_editTitelButton',
					after: {
		                save: function() {
		                    <portlet:namespace/>changeLayerConfig("LayerTitel", this);
		                }
		            }
				});


				new A.Editable({
					node: '#<portlet:namespace/>layer_'+i_count+'_'+layerobjecttypname+'_'+layerobjekt.id+'_editDescriptionButton',
					inputType: 'textarea',
					after: {
		                save: function() {
		                    <portlet:namespace/>changeLayerConfig("LayerDescription", this);
		                }
		            }
				});
			}
		}
	}
});