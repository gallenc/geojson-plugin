/*
 * Copyright 2014 OpenNMS Group Inc., Entimoss ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opennms.plugins.geojson.rest;



import org.opennms.plugins.geojson.NodeGeoJsonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * REST service to post mqtt data to opennms
 */
@Path("/geojson")
public class GeoJsonRestImpl {
	private static final Logger LOG = LoggerFactory.getLogger(GeoJsonRestImpl.class);

	/**
	 * Allows ReST interface to request geojson nodes
	 */
	
	@GET
	@Path("/nodes/")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response getNodes() throws Exception {
		LOG.debug("received GET /nodes/");

		NodeGeoJsonService nodeGeoJsonService = ServiceLoader.getNodeGeoJsonService();
		if (nodeGeoJsonService == null) throw new RuntimeException("ServiceLoader.getNodeGeoJsonService() cannot be null.");

		try{
			String json = nodeGeoJsonService.getJsonString();
			return Response.status(200).entity(json).build();  
			
		} catch(Exception ex){
			LOG.error("problem respondinf to GET /nodes/",ex);
			return Response.status(500).entity("problem respondinf to GET /nodes/ Exception: "+ex).build();  
		}
		

	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@GET
//	@Path("/{topic}/{qos}/")
//	@Consumes({MediaType.APPLICATION_JSON})
//	@Produces({MediaType.APPLICATION_JSON})
//	public Response mqttPostMessage(@PathParam("topic") String topic,@PathParam("qos") String qosStr, String payloadStr) throws Exception {
//		LOG.debug("received GET mqtt message: /receive/-topic-/-qos-/ : /receive/"+topic+ "/"+qosStr
//				+ "  json payload "+payloadStr);
//
//		NodeGeoJsonService mqttRxService = ServiceLoader.getNodeGeoJsonService();
//		if (mqttRxService == null) throw new RuntimeException("ServiceLoader.getNodeGeoJsonService() cannot be null.");
//
//		try{
//			
//		} catch(Exception ex){
//			LOG.error("Problem receiving message: POST mqtt message: /receive/-topic-/-qos-/ : /receive/"+topic+ "/"+qosStr
//					+ "  json payload "+payloadStr,ex);
//			return Response.status(500).entity("Problem receiving message: POST mqtt message /receive/-topic-/-qos-/ : /receive/"+topic+ "/"+qosStr
//					+ "  json payload "+payloadStr+"  Exception:"+ex).build();  
//		}
//		return Response.status(200).build();  
//
//	} 

	
}