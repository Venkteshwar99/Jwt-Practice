package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.model.User;

@Service
public class UserService {
	
	List<User> list = new ArrayList<>();
	
	public UserService() {
		
		list.add(new User(UUID.randomUUID().toString(), "Rahul", "rahul@gmail.com"));
		list.add(new User(UUID.randomUUID().toString(), "Vinod", "vinod@gmail.com"));
		list.add(new User(UUID.randomUUID().toString(), "Vikram", "vikram@gmail.com"));
		list.add(new User(UUID.randomUUID().toString(), "Vipin", "vipin@gmail.com"));
	}
	
	public List<User> getUsers() {
		return this.list;
	}
	
}
