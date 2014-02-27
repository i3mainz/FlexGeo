<%@ include file="init.jsp"%>

<div id="map"></div>

<script>

var currentExtent;

AUI().ready(function(A){
// 		var layer = new OpenLayers.Layer.OSM("OSM Simple");

// 		var map = new OpenLayers.Map('map');
// 		map.addLayers([ layer]);
// 		map.zoomToMaxExtent();
		
		var map = new ol.Map({
	        target: 'map',
	        layers: [
// 	          new ol.layer.Tile({
// 	            source: new ol.source.MapQuestOpenAerial()
// 	          })
		       	new ol.layer.Tile({
		        	source: new ol.source.OSM()
		        })/*,
	            new ol.layer.Image({
	                source: new ol.source.ImageWMS(({
	                  url: 'http://tweetmap.fh-mainz.de/geoserver/cite/wms',
	                  params: {
	                	  'LAYERS': 'cite:tweets_time',
	                	  'transparent': true,
	                	  'STYLES':'TweetHeatmap',
	                	  'TIME': '2014-02-12T13:53:53.861Z/2014-02-19T22:03:10.098Z' ,
	                	 'CQL_FILTER': 'thema_id=693'
	                  },
	                  serverType: 'geoserver'
	                }))
	            })*/,
	            new ol.layer.Tile({
	                source: new ol.source.TileWMS(/** @type {olx.source.TileWMSOptions} */ ({
	                  url: 'http://tweetmap.fh-mainz.de/geoserver/cite/wms',
	                  params: {
	                	  'LAYERS': 'cite:tweets_time', 
	                	  'TILED': true,
	                	  'STYLES':'TweetBird'/*,
	                	  'TIME': '2014-02-12T13:53:53.861Z/2014-02-19T22:03:10.098Z' */,
	                	 'CQL_FILTER': 'thema_id=<%=reportID%>'
	                  },
	                  serverType: 'geoserver'
	                }))
	            })
	        ],
	       	renderer: 'canvas',
	        view: new ol.View2D({
	          center: ol.proj.transform([8.23,49.99], 'EPSG:4326', 'EPSG:900913'),
	          zoom: 10
	        })
	      });
		
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
			var layer = map.getLayers().getAt(1);
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
		
});
</script>
	