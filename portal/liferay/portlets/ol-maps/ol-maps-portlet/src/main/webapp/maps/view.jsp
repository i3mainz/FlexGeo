<%@ include file="init.jsp"%>

<div id="map"></div>

<script>
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
	                	 'CQL_FILTER': 'thema_id=696'
	                  },
	                  serverType: 'geoserver'
	                }))
	            })
	        ],
	       	renderer: ol.RendererHint.CANVAS,
	        view: new ol.View2D({
	          center: ol.proj.transform([8.23,49.99], 'EPSG:4326', 'EPSG:900913'),
	          zoom: 10
	        })
	      });
		
		function onMoveEnd(evt){
			var map = evt.map;
			var extent = map.getView().calculateExtent(map.getSize());
			extent = ol.proj.transform(extent,'EPSG:900913','EPSG:4326');
			Liferay.fire('MapExtentChanged',{
				bbox: extent.toString()
			});
		}
		
		map.on('moveend',onMoveEnd);
		
		Liferay.on('TimeRangeChanged', function(event){
			starttime = event.start.toJSON();
			endtime = event.end.toJSON();
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
		
});
</script>
	