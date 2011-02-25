package com.luisffc.pocs.jersey.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/users")
public class Users {

	@GET
	@Produces("application/xml")
	public String list(){
		return "<usuarios><usuario>aee</usuario></usuarios>";
	}
}
