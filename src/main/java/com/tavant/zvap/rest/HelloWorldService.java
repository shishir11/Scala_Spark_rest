package com.tavant.zvap.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
import tavant.practise.java.HelloScala;
@Path("/zvap")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
	@Path("/record/{param}")
	public Response GetDetails(@PathParam("param") String msg) {
		new HelloScala().runSparkJob();
		String output = "details is fetching... : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
}