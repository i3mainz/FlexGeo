<%@ include file="init.jsp"%>

<div id="map"></div>

<script>

var currentExtent;

AUI().ready(function(A){
	
		var map = new ol.Map({
	        target: 'map',
	       	renderer: 'canvas',
	        view: new ol.View({
	          center: ol.proj.transform([0,0], 'EPSG:4326', 'EPSG:900913'),
	          zoom: 2
	        })
	    });
		
		var basismapkey = <%=basismap%>;
		
		var basismap;
		
		if(basismapkey==<%=OLMapConstants.BASISMAP_MAPQUEST_FULL%>){
			 basismap = new ol.layer.Group({
				 layers: [
		      		new ol.layer.Tile({
		        		source: new ol.source.MapQuest({layer: 'sat'})
		      		}),
		      		new ol.layer.Tile({
		        		source: new ol.source.MapQuest({layer: 'hyb'})
		      		})
		 		]
			 });
		}else if(basismapkey==<%=OLMapConstants.BASISMAP_MAPQUEST_OSM%>){
			basismap = new ol.layer.Tile({
   				source: new ol.source.MapQuest({layer: 'osm'})
 			});
		}else if(basismapkey==<%=OLMapConstants.BASISMAP_MAPQUEST_SAT%>){
			basismap = new ol.layer.Tile({
    			source: new ol.source.MapQuest({layer: 'sat'})
  			});
		}else if(basismapkey==<%=OLMapConstants.BASISMAP_BING%>){
			//TODO
		}else{
			basismap = new ol.layer.Tile({
	        	source: new ol.source.OSM()
	        });
		}
		
		map.addLayer(basismap);
		
		<%
		for (Iterator<Entry<Integer,OLMapsLayer>> itr = layers.entrySet().iterator(); itr.hasNext();) {
			Entry<Integer, OLMapsLayer> layerEntry = itr.next();
			Map<String, Object> params = layerEntry.getValue().getParams();
			if(layerEntry.getKey()!=0){
		%>
				var layer;
				var test = <%=params.get("TILED")%>;				
				if(test==false){
					 layer = new ol.layer.Image({
			            source: new ol.source.ImageWMS(({
			                url: '<%=layerEntry.getValue().getUrl()%>',
			                params: {
			              	  'LAYERS': '<%=params.get("LAYERS")%>', 
			              	  'TILED': <%=params.get("TILED")%>,
			              	  'STYLES':'<%=params.get("STYLES")%>',
			              	  'CQL_FILTER': 'thema_id=<%=reportID%>'
			                },
			                serverType: '<%=params.get("serverType")%>',
			              })),
			              opacity: <%=layerEntry.getValue().getOpacity()/100%>
			        });
				}else{
					layer = new ol.layer.Tile({
			            source: new ol.source.TileWMS(({
			                url: '<%=layerEntry.getValue().getUrl()%>',
			                params: {
			              	  'LAYERS': '<%=params.get("LAYERS")%>', 
			              	  'TILED': <%=params.get("TILED")%>,
			              	  'STYLES':'<%=params.get("STYLES")%>',
			              	  'CQL_FILTER': 'thema_id=<%=reportID%>'
			                },
			                serverType: '<%=params.get("serverType")%>',
			              })),
			              opacity: <%=layerEntry.getValue().getOpacity()/100%>
			        });
				}
				
				map.addLayer(layer);
		
		<%
			}
		}
		%>
		
		function checkExtent(a,b){
			var c1 = ol.extent.getCenter(a);
			var c2 = ol.extent.getCenter(b);
			for(var i=c1.length -1; i>=0; --i){
				if(c1[i] != c2[i]){
					return false;
				}
			}
			c1 = ol.extent.getSize(a);
			c2 = ol.extent.getSize(b);
			return c1[0] == c2[0] && c1[1] == c2[1];
		}
		
		function onMoveEnd(evt){
			var map = evt.map;
			changeExtent(map, true);
		}
		
		function changeExtent(map,check){
			var extent = map.getView().calculateExtent(map.getSize());
			if(currentExtent==null){
				currentExtent = extent;
			}else{
				if(!checkExtent(currentExtent,extent) || !check){
					currentExtent = extent;
					extent = ol.proj.transform(extent,'EPSG:900913','EPSG:4326');
					Liferay.fire('MapExtentChanged',{
						bbox:{
							lonmin: extent[0],
							latmin: extent[1],
							lonmax: extent[2],
							latmax: extent[3]
						}
					});
				}
				
			}
		}
		
		map.on('moveend',onMoveEnd);
		
		map.on('singleclick', function(evt) {
			var map = evt.map;
			var viewResolution = (map.getView().getResolution());
			var viewProjection = (map.getView().getProjection());
			var clickPosition = evt.coordinate;
			var layer = map.getLayers().getAt(map.getLayers().getLength()-1);
			var source = layer.getSource();
			if(source instanceof ol.source.TileWMS || source instanceof ol.source.ImageWMS){
				var url = source.getGetFeatureInfoUrl(
				    clickPosition, viewResolution, viewProjection,
				    {'INFO_FORMAT': 'text/html'});
				var url2 = source.getGetFeatureInfoUrl(
					    clickPosition, viewResolution, viewProjection,
					    {
					    	'INFO_FORMAT': 'application/json',
					    	'propertyName': 'benutzer,tweet,zeit'
					    });
				if (url && url2) {
				  Liferay.fire('showFeatureInfo',{
					  url: url,
					  url2: url2
				  });		
				}
			}
		});
		
		Liferay.on('TimeRangeChanged', function(event){
			starttime = event.start.toJSON();
			endtime = event.end.toJSON();
			//Hier wird die Zeit für den Geoserver WMS angepasst. 
			starttimegmt = new Date(starttime);
			starttimegmt.setHours(starttimegmt.getHours()+2*(starttimegmt.getTimezoneOffset()/-60));
			endtimegmt = new Date(endtime);
			endtimegmt.setHours(endtimegmt.getHours()+2*(endtimegmt.getTimezoneOffset()/-60));
			starttime = starttimegmt.toJSON();
			endtime = endtimegmt.toJSON();
			//Ende der Anpassung
			map.getLayers().forEach(function(layer){
				time = starttime+'/'+endtime;
				var source = layer.getSource();
				if(source instanceof ol.source.TileWMS || source instanceof ol.source.ImageWMS){
					source.updateParams({
						'TIME': time
					});
				}
			});
		});
		
		Liferay.on('LayerOpacityChanged', function(event){
			opacity = event.opacity;
			map.getLayers().forEach(function(layer){
				var source = layer.getSource();
				if(source instanceof ol.source.TileWMS || source instanceof ol.source.ImageWMS){
					layer.setOpacity(parseInt(opacity) / 100);
				}
			});
		});
		
		Liferay.on('LayerSettingChanged', function(event){
			var layer = map.getLayers().getAt(event.layerID);
			if(event.key=="visibility"){
				layer.setVisible(event.value);
			}else if (event.key="opacity"){
				layer.setOpacity(parseInt(event.value) / 100);
			}
		});
		
});
</script>
	