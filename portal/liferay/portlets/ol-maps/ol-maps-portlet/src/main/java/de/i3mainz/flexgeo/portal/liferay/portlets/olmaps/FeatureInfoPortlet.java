package de.i3mainz.flexgeo.portal.liferay.portlets.olmaps;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.springframework.web.client.RestTemplate;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class FeatureInfoPortlet extends MVCPortlet {
	
	private static Log LOG = LogFactoryUtil.getLog(FeatureInfoPortlet.class);

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		
		RestTemplate template = new RestTemplate();

		if ("gsProxy".equals(ParamUtil.getString(resourceRequest,
				"request"))) {
			String url = ParamUtil.getString(resourceRequest, "proxyURL", null);
			url = URLDecoder.decode(url, "UTF-8");
			if(url!=null) {
				
				LOG.info("URL: "+url);
				String jsonresult = template.getForObject(url, String.class);
				LOG.info("RESULT: "+jsonresult);
				OutputStream out = resourceResponse.getPortletOutputStream();
				
				out.write(jsonresult.getBytes(
						System.getProperty("file.encoding")));
				out.flush();
				out.close();
			}
		}
	}
}
