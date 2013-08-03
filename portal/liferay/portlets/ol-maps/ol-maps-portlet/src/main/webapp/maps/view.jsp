<%@ include file="init.jsp"%>

<div id="map"></div>

<script>
AUI().ready(function(A){
		var layer = new OpenLayers.Layer.OSM("OSM Simple");

		var map = new OpenLayers.Map('map');
		map.addLayers([ layer]);
		map.zoomToMaxExtent();
});
</script>
	