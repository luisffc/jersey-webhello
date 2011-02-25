package com.luisffc.pocs.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private String nome;

	public User(){}
	
	public User(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
