<%@ include file="init.jsp"%>

<div id="infocontainer"></div>
<div id="infocontainer2">
</div>

<script>

AUI().ready('aui-io-request',function(A){
	
	Liferay.on('showFeatureInfo', function(event){
		var url = event.url;
		var url2 = event.url2;
		console.log(url2);
		A.one('#infocontainer').setContent('<iframe seamless src="' + url + '"></iframe>');
		var jsonURL = '<%= currentResUrl.toString() %>'
			+"&<portlet:namespace/>request=gsProxy"
			+"&<portlet:namespace/>proxyURL="+encodeURIComponent(url2);

		A.io.request(jsonURL, {
			  dataType: 'json',
			  method: 'GET',
			  on: {
			  	success: function() {
			  		console.log("Hallo hier bin ich");
			  		console.log(this.get('responseData'));
			  		var container = A.one('#infocontainer2');
			  		var features = this.get('responseData').features;
			  		features.forEach(function(feature){
			  			console.log(feature);
			  			var properties = feature.properties;
			  			var header = A.Node.create('<h3>TESTHEADER</h3>');
			  			header.appendTo(container);
			  			var name = A.Node.create('<div><span>'+properties.benutzer+"</span>");
			  			name.appendTo(container);
			  			var datum = A.Node.create('<span>'+properties.zeit+"</span></div>");
			  			datum.appendTo(container);
			  			var text = A.Node.create('<div>'+properties.tweet+"</div>");
			  			text.appendTo(container);
			  		});
			   	}
			  }
		});
	});
	
});
</script>

