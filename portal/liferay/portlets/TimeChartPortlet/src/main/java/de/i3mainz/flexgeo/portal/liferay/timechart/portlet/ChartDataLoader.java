package de.i3mainz.flexgeo.portal.liferay.timechart.portlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public interface ChartDataLoader {

	/**
	 * @return the result
	 */
	public abstract String getJson();

	public abstract void write(OutputStream out)
			throws UnsupportedEncodingException, IOException;

}