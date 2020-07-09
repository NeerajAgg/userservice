package com.demo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
		
	@RequestMapping("/{userId}")
	public User getUserById(@PathVariable Long userId) {
		return userService.getUser(userId);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = userService.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
}
