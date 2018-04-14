package org.opennms.plugins.geojson;

public class TestGeoJsonObject {

	public static String getJson(){
		String json =""
				+"{ \"type\": \"FeatureCollection\",  "
				+"\n	  \"features\": [  "
				+"\n	    {  "
				+"\n	      \"type\": \"Feature\",  "
				+"\n	      \"properties\": {  "
				+"\n	        \"STATE\": \"New Mexico\",  "
				+"\n	        \"STATE_CODE\": 29,  "
				+"\n	        \"CLIMDIV\": 2905,  "
				+"\n	        \"NAME\": \"CENTRAL VALLEY\"  "
				+"\n	      },  "
				+"\n	      \"geometry\": {  "
				+"\n	        \"type\": \"Polygon\",  "
				+"\n	        \"coordinates\": [  "
				+"\n	          [  "
				+"\n	            [ -105.87799800030689, 33.24399899955506 ],  "
				+"\n	            [ -105.98500100019538, 33.269000999597324 ]  "
				+"\n	          ]  "
				+"\n	        ]  "
				+"\n	      }  "
				+"\n	    },  "
				+"\n	    {  "
				+"\n	      \"type\": \"Feature\",  "
				+"\n	      \"properties\": {  "
				+"\n	        \"STATE\": \"New Mexico\",  "
				+"\n	        \"STATE_CODE\": 29,  "
				+"\n	        \"CLIMDIV\": 2906,  "
				+"\n	        \"NAME\": \"CENTRAL HIGHLANDS\"  "
				+"\n	      },  "
				+"\n	      \"geometry\": {  "
				+"\n	        \"type\": \"Polygon\",  "
				+"\n	        \"coordinates\": [  "
				+"\n	          [  "
				+"\n	            [ -105.14900200004166, 32.63999899975494 ],  "
				+"\n	            [ -105.22300000044908, 32.5630000003506 ] "
				+"\n	          ]  "
				+"\n	        ]  "
				+"\n	      }  "
				+"\n	    }  "
				+"\n	  ]  "
				+"\n	}  "
				+"\n  ";

		return json;
	}

}
