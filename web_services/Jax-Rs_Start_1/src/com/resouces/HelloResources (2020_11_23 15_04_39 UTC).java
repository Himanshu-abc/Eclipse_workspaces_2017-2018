package com.resouces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResources {

	@GET
	@Produces("plain/text")
	public String hello() {
		return "Welcome to jax-rs";
	}
}
