package com.luisffc.pocs.jersey.repository;

import java.util.ArrayList;
import java.util.List;

import com.luisffc.pocs.jersey.model.User;

public class UserDao {

	private List<User> data = new ArrayList<User>();
	
	public UserDao(){
		data.add(new User("luis"));
		data.add(new User("fernando"));
		data.add(new User("fogaca"));
	}

	public List<User> findAll(){
		return data;
	}
	
	public User findByName(String name){
		for (User user : data) {
			if( name.equals(user.getNome()) ) return user;
		}
		return null;
	}
}
