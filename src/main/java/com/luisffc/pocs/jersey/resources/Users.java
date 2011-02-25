package com.luisffc.pocs.jersey.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.luisffc.pocs.jersey.model.User;
import com.luisffc.pocs.jersey.repository.UserDao;

@Path("/users")
public class Users {

	private UserDao dao = new UserDao();
	
	@GET
	@Produces("application/xml")
	public List<User> list(){
		return dao.findAll();
	}
	
	@GET
	@Path("/{nome}")
	public User getUser(@PathParam("nome") String nome){
		return dao.findByName(nome);
	}

}
