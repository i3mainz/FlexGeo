<%@ include file="/init.jsp"%>

<%	
	int basismap = GetterUtil.getInteger(preferences.getValue(
			"basismap",
			String.valueOf(OLMapConstants.BASISMAP_DEFAULT)));
%>