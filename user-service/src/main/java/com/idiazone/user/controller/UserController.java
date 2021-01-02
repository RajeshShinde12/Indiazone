package com.idiazone.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idiazone.user.response.UserResponse;
import com.idiazone.user.service.UserService;
import com.idiazone.user.util.ResponseUtility;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(path="/all", produces = "application/json")
	public ResponseEntity<UserResponse> getAllUsers() {
		return ResponseUtility.getSucessResponse(userService.getAllUsers());
	}
	
	@GetMapping(path="/{id}",produces = "application/json")
	public ResponseEntity<UserResponse> getUserById(@PathVariable("id") Integer userId) {
		return ResponseUtility.getSucessResponse(userService.getUserById(userId));
	}

}
