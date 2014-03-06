<%@ include file="init.jsp"%>

<style>

svg {
  font: 10px sans-serif;
}

.area {
  fill: steelblue;
  clip-path: url(#clip);
}

.area-slider {
  fill: green;
  clip-path: url(#clip);
}

.line {
	fill: none;
	stroke: orange;
	stroke-width: 1.5px;
	clip-path: url(#clip);
}

.axis path,
.axis line {
  fill: none;
  stroke: #000;
  shape-rendering: crispEdges;
}

.brush .extent {
  stroke: #fff;
  fill-opacity: .125;
  shape-rendering: crispEdges;
}

</style>

<div id="chart"></div>

<script>

	AUI().ready('liferay-portlet-url',function(A) {
		
		//var currentResUrl = Liferay.PortletURL.createResourceURL(); 
		//currentResUrl.setPortletId("_WAR_1_1_TimeChartPortlet-0.0.1-SNAPSHOT");

		var margin = {top: 10, right: 10, bottom: 100, left: 40},
		    margin2 = {top: 230, right: 10, bottom: 20, left: 40},
		    width = parseInt(d3.select('#chart').style('width'), 10)
		    width = width - margin.left - margin.right,
		    height = 300 - margin.top - margin.bottom,
		    height2 = 300 - margin2.top - margin2.bottom;
	
		var parseDate = d3.time.format("%Y-%m-%dT%H:%M:%SZ").parse;
	
		var x = d3.time.scale().range([0, width]),
		    x2 = d3.time.scale().range([0, width]),
		    y = d3.scale.linear().range([height, 0]),
		    y2 = d3.scale.linear().range([height2, 0]);
	
		var xAxis = d3.svg.axis().scale(x).orient("bottom"),
		    xAxis2 = d3.svg.axis().scale(x2).orient("bottom"),
		    yAxis = d3.svg.axis().scale(y).orient("left");
	
		var brush = d3.svg.brush()
		    .x(x2)
		    .on("brush", brushed);
	
		var area = d3.svg.area()
		    .interpolate("basis-open")
		    .x(function(d) { return x(d.date); })
		    .y0(height)
		    .y1(function(d) { return y(d.price); });
		
		var line = d3.svg.line()
			.interpolate("basis-open")
			.x(function(d) {return x(d.date); })
			.y(function(d) {return y(d.price);});
	
		var area2 = d3.svg.area()
		    .interpolate("basis-open")
		    .x(function(d) { return x2(d.date); })
		    .y0(height2)
		    .y1(function(d) { return y2(d.price); });
		
		var line2 = d3.svg.line()
			.interpolate("basis-open")
			.x(function(d) {return x2(d.date); })
			.y(function(d) {return y2(d.price);});
	
		var svg = d3.select("#chart").append("svg")
		    .attr("width", width + margin.left + margin.right)
		    .attr("height", height + margin.top + margin.bottom);
	
		var rect = svg.append("defs").append("clipPath")
		    .attr("id", "clip")
		  .append("rect")
		    .attr("width", width)
		    .attr("height", height);
	
		var focus = svg.append("g")
		    .attr("class", "focus")
		    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
	
		var context = svg.append("g")
		    .attr("class", "context")
		    .attr("transform", "translate(" + margin2.left + "," + margin2.top + ")");
		<%
			currentResUrl.setParameter("getRequest", "loadChartData");
		//currentResUrl.setParameter("reqbbox", "50.832478,8.07234,51.565656,8.3654665");
		%>
		
		//currentResUrl.setParameter('getRequest','loadChartData');
		
		//var jsonURL = currentResUrl;
		var jsonURL = '<%= currentResUrl.toString() %>';
		
		d3.json(jsonURL, function(error, json) {
			
			var data = json.map(function (entry){
				return {
					date: parseDate(entry.zeit),
					price: +entry.dichte
				};
			});
			
		  x.domain(d3.extent(data.map(function(d) { 
			  	return d.date; 
			  })));
		  y.domain([0, d3.max(data.map(function(d) { 
			  	return d.price;
			  }))]);
		  x2.domain(x.domain());
		  y2.domain(y.domain());
	
		  focus.append("path")
		      .datum(data)
		      .attr("class", "area")
		      .attr("d", area);
	
		  focus.append("g")
		      .attr("class", "x axis")
		      .attr("transform", "translate(0," + height + ")")
		      .call(xAxis);
	
		  focus.append("g")
		      .attr("class", "y axis")
		      .call(yAxis);
	
		  context.append("path")
		      .datum(data)
		      .attr("class", "area-slider")
		      .attr("d", area2);
	
		  context.append("g")
		      .attr("class", "x axis")
		      .attr("transform", "translate(0," + height2 + ")")
		      .call(xAxis2);
	
		  context.append("g")
		      .attr("class", "x brush")
		      .call(brush)
		    .selectAll("rect")
		      .attr("y", -6)
		      .attr("height", height2 + 7);
		  
		  	appendExtentGraph(null,false);
			updateMap();
		  
		});
		
		function appendExtentGraph(extent, update){
			<%
				//currentResUrl.setParameter("reqbbox", "50.832478,8.07234,51.565656,8.3654665");
			%>
			var bbox = extent;
			//currentResURL.setParameter('reqbbox',bbox);
			//var jsonURL = currentResURL;
			var jsonURL = '<%= currentResUrl.toString() %>';
			if(bbox!=null){
				jsonURL+="&<portlet:namespace/>reqbbox="+bbox;
			}
			
			d3.json(jsonURL, function(error, json) {
				
				var data = json.map(function (entry){
					return {
						date: parseDate(entry.zeit),
						price: +entry.dichte
					};
				});
				
				if(update){
					focus.selectAll(".line")
						.datum(data)
						.attr("d", line);
					context.selectAll(".line")
						.datum(data)
						.attr("d", line2);
				}else{
					focus.append("path")
			  			.datum(data)
			  			.attr("class", "line")
			  			.attr("d",line);
					context.append("path")
			  			.datum(data)
			  			.attr("class", "line")
			  			.attr("d",line2);
				}
			});
		}

	
		function brushed() {
		  x.domain(brush.empty() ? x2.domain() : brush.extent());
		  focus.select(".area").attr("d", area);
		  focus.select(".line").attr("d", line);
		  focus.select(".x.axis").call(xAxis);
		  updateMap();
		}
		
		function updateMap(){
			Liferay.fire('TimeRangeChanged',{
				 start : x.domain()[0],
				 end : x.domain()[1]
			  });
		}
		
		d3.select(window).on('resize', resize); 

		function resize() {
		    // update width
		    width = parseInt(d3.select('#chart').style('width'), 10);
		    width = width - margin.left - margin.right;
		    
		    svg.selectAll('rect.background')
	        .attr('width', width);

	    	svg.selectAll('rect.percent')
	        .attr('width', function(d) { return x(d.percent); });
		    
		    svg.attr("width", width);
		    
		    // reset x range
		    x.range([0, width]);
		    x2.range([0, width]);
		    
		    svg.select('.x.axis.bottom').call(xAxis.orient('bottom'));

		    // do the actual resize...
		}
		
		Liferay.on('portletMoved', function(event) {
		    var portlet = event.portlet;

		    var newWidth = portlet.width(),
		        newHeight = portlet.height();
		    // update width
		    width = parseInt(d3.select('#chart').style('width'), 10);
		    width = width - margin.left - margin.right;

		    // reset x range
		    x.range([0, width]);
		    x2.range([0, width]);
		    
		    rect.attr("width", width);
		    svg.attr("width", width);
		    
		});
		
		Liferay.on('MapExtentChanged', function(event){
			var bbox = event.bbox;
			var bboxStr = bbox.latmin+","+bbox.lonmin+","+bbox.latmax+","+bbox.lonmax;
			appendExtentGraph(bboxStr,true);
		});

	});
</script>