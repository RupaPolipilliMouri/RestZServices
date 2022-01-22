package com.mouritech.helloworldservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")

public class HelloWorldRestServiceExample
{

	   //@Path("/printhello")
	   @GET
	   public String printHello() {
		   return "Hello From the Rest Service";
	   }

}