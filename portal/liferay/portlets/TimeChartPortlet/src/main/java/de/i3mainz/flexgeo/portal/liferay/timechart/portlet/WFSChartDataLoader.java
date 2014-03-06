package de.i3mainz.flexgeo.portal.liferay.timechart.portlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import org.springframework.web.client.RestTemplate;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class WFSChartDataLoader implements ChartDataLoader {
	
	private static Log LOG = LogFactoryUtil.getLog(WFSChartDataLoader.class);
	private final RestTemplate template;
	private String json = null;
	
	public WFSChartDataLoader(Long themaID, String bbox,int precision) {
		super();
		template = new RestTemplate();
		this.initialize(themaID,bbox,precision);
	}
	
	private void initialize(Long themaID,String bbox,int precision) {
		String url = "http://tweetmap.fh-mainz.de/geoserver/cite/ows?"
				+ "service=WFS&version=2.0.0&" + "request=GetFeature&"
				+ "typeName=cite:tweets_time&"
				+ "outputFormat=application/json&"
				+ "propertyName=zeit,gewicht&"
				+ "sortBy=zeit&";
		if(themaID!=null) {
			url+= "cql_filter=thema_id="+themaID;
			if(bbox!=null && !bbox.isEmpty()) {
				url+=" AND BBOX(location,"+bbox+")";
			}
		}			
		long startTime = System.nanoTime();
		String jsonresult = template.getForObject(url, String.class);
		long endTime = System.nanoTime();
		LOG.info("Zeit Tweetmap-Request: "+(endTime-startTime)/10000000);
		TimeChartJSONArray resultArray = new TimeChartJSONArray();
		startTime = System.nanoTime();
		resultArray.fill(jsonresult,precision);
		endTime = System.nanoTime();
		LOG.info("Zeit Fill-TimeChartArray: "+(endTime-startTime)/10000000);
		startTime = System.nanoTime();
		this.json = resultArray.getJSON();
		endTime = System.nanoTime();
		LOG.info("Zeit GetJSONString: "+(endTime-startTime)/10000000);
		LOG.info("Anzahl Eintraege: "+resultArray.size());
	}

	/* (non-Javadoc)
	 * @see de.i3mainz.flexgeo.portal.liferay.timechart.portlet.ChartDataLoader#getJson()
	 */
	@Override
	public String getJson() {
		return json;
	}
	
	/* (non-Javadoc)
	 * @see de.i3mainz.flexgeo.portal.liferay.timechart.portlet.ChartDataLoader#write(java.io.OutputStream)
	 */
	@Override
	public void write (OutputStream out) throws UnsupportedEncodingException, IOException {
		long startTime = System.nanoTime();
		if (this.getJson() != null) {
			out.write(this.getJson().getBytes(
					System.getProperty("file.encoding")));
			out.flush();
			out.close();
		}
		long endTime = System.nanoTime();
		LOG.info("Zeit Write to Output: "+(endTime-startTime)/10000000);
	}
	
	

}
