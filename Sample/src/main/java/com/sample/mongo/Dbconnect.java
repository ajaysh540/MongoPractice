package com.sample.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Dbconnect {

	@Autowired
	public RepoSample repoSample;
	
	public void saveUser(User user) {
		repoSample.save(user);
	}
	
	public List<User> getUsers(){
		return (List<User>)repoSample.findAll();
	}
}
