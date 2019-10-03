package com.sample.mongo;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	String id;
	String name;
	String pass;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	
	
	public User(String name, String pass) {
		this.name=name;
		this.pass=pass;
	}
	
	
}
