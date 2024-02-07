package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/user")
	public List<User> getUser() {
		return service.getUsers();
	}
	
	@GetMapping("/hello")
	public List<User> getHome() {
		return service.getUsers();
	}
}
