package org.opennms.plugins.geojson;

public class NodeGeoJsonServiceImpl implements NodeGeoJsonService {
	
	public void destroy(){
		
	}

	@Override
	public String getJsonString(){
		return TestGeoJsonObject.getJson();
	}
	
	
}
