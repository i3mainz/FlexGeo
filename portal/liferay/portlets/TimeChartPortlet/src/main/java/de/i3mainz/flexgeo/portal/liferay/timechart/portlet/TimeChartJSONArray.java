package de.i3mainz.flexgeo.portal.liferay.timechart.portlet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class TimeChartJSONArray extends TreeMap<Date, JSONObject> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6213013024841673541L;

	public void fill(String jsonString, int startAggregation) {
		try {
			JSONArray jArray = JSONFactoryUtil.createJSONObject(jsonString)
					.getJSONArray("features");
			DateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss'Z'");

			if (startAggregation > Calendar.MILLISECOND
					|| startAggregation < Calendar.YEAR) {
				startAggregation = Calendar.HOUR_OF_DAY;
			}

			if (startAggregation == Calendar.HOUR) {
				startAggregation = Calendar.HOUR_OF_DAY;
			}

			for (int i = 0; i < jArray.length(); i++) {
				String zeitString = jArray.getJSONObject(i)
						.getJSONObject("properties").getString("zeit");
				double gewicht = Double.valueOf(jArray.getJSONObject(i)
						.getJSONObject("properties").getString("gewicht"));
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(formatter.parse(zeitString));
				for (int precision = startAggregation + 1; precision <= Calendar.MILLISECOND; precision++) {
					if (precision == Calendar.MONTH
							|| precision == Calendar.WEEK_OF_MONTH
							|| precision == Calendar.DAY_OF_MONTH
							|| precision == Calendar.HOUR_OF_DAY
							|| precision >= Calendar.MINUTE)
						calendar.set(precision, 0);
				}

				this.add(calendar.getTime(), zeitString, gewicht);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getJSON() {
		String result = null;
		StringBuilder strBuild = new StringBuilder();
		strBuild.append("[");
		boolean first = true;
		for (Iterator<JSONObject> itr = this.values().iterator(); itr.hasNext();) {
			if (!first) {
				strBuild.append(",");
			}
			JSONObject tmp = itr.next();
			tmp.put("gewicht",
					this.calcAverage(tmp.getJSONArray("einzelgewichte")));
			tmp.put("dichte", tmp.getJSONArray("einzelgewichte").length());
			tmp.remove("einzelgewichte");
			strBuild.append(tmp.toString());
			first = false;
		}
		strBuild.append("]");

		if (strBuild.length() > 2) {
			result = strBuild.toString();
		}
		return result;
	}

	private JSONObject add(Date key, String time, Double gewicht) {
		JSONObject feature = JSONFactoryUtil.createJSONObject();
		feature.put("zeit", time);
		feature.put("gewicht", gewicht);
		return this.put(key, feature);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.TreeMap#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public JSONObject put(Date key, JSONObject value) {

		JSONObject feature = this.get(key);
		if (feature == null) {
			feature = value;
			feature.put("einzelgewichte", JSONFactoryUtil.createJSONArray());
		}
		feature.put("einzelgewichte", feature.getJSONArray("einzelgewichte")
				.put(value.getDouble("gewicht")));

		return super.put(key, feature);
	}

	private Double calcAverage(JSONArray array) {
		double a = 0.0;
		for (int i = 0; i < array.length(); i++) {
			a += array.getDouble(i);
		}
		return (a / array.length());
	}

}
