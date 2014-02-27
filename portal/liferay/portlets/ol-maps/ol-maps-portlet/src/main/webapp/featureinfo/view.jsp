<%@ include file="init.jsp"%>

<div id="infocontainer"></div>
<div id="infocontainer2">
	<h3></h3>
	<div>
		<span id="tweetnutzer"></span>
		<span id="tweettext"></span>
	</div>
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
			     	A.one('#infocontainer2').setContent(this.get('responseData').features[0].properties.benutzer);
			   	}
			  }
		});
	});
	
});
</script>

