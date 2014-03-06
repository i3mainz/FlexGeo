package de.i3mainz.flexgeo.portal.liferay.olmaps.services.service.impl;

import java.util.HashMap;
import java.util.Map;

import de.i3mainz.flexgeo.portal.liferay.olmaps.services.model.impl.OLMapsLayer;
import de.i3mainz.flexgeo.portal.liferay.olmaps.services.model.impl.OLMapsLayerList;
import de.i3mainz.flexgeo.portal.liferay.olmaps.services.service.OLMapsMapService;

public class OLMapsMapServiceImpl implements OLMapsMapService {

	private OLMapsLayerList layerList;

	public OLMapsMapServiceImpl(long reportID) {
		layerList = new OLMapsLayerList();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("LAYERS", "cite:tweets_time");
		params.put("TILED", false);
		params.put("STYLES", "TweetHeatmap");
		params.put("serverType", "geoserver");
		layerList.put(1, new OLMapsLayer("R" + reportID + "L" + 1,
				"HeatMap", "Tweetverteilung als HeatMap", 100,
				"http://tweetmap.fh-mainz.de/geoserver/cite/wms", params));
		Map<String, Object> params2 = new HashMap<String, Object>();
		params2.put("LAYERS", "cite:tweets_time");
		params2.put("serverType", "geoserver");
		params2.put("TILED", true);
		params2.put("STYLES", "TweetBird");
		layerList.put(2, new OLMapsLayer("R" + reportID + "L" + 2,
				"Tweetmap-TweetBird", "Layer von Tweetmap mit Tweet Bird", 100,
				"http://tweetmap.fh-mainz.de/geoserver/cite/wms", params2));
	}

	@Override
	public OLMapsLayerList getLayers() {
		// TODO Auto-generated method stub
		return layerList;
	}
}
