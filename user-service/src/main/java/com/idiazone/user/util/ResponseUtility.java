package com.idiazone.user.util;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.idiazone.user.model.User;
import com.idiazone.user.response.Status;
import com.idiazone.user.response.UserResponse;

public class ResponseUtility {
	
	public static ResponseEntity<UserResponse> getSucessResponse(User user) {
		UserResponse response = new UserResponse();
		response.setUser(user);
		response.setStatus(Status.SUCCESS);
		response.setMessage(Status.SUCCESS.name());
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<UserResponse> getSucessResponse(List<User> users) {
		UserResponse response = new UserResponse();
		response.setUsers(users);
		response.setStatus(Status.SUCCESS);
		response.setMessage(Status.SUCCESS.name());
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<UserResponse> getFailureResponse(String failureMessage) {
		UserResponse response = new UserResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(failureMessage);
		return ResponseEntity.ok(response);
	}
	
	public static ResponseEntity<UserResponse> getFailureResponse(String failureMessage,HttpStatus status) {
		UserResponse response = new UserResponse();
		response.setStatus(Status.FAILURE);
		response.setMessage(failureMessage);
		return ResponseEntity.status(status).body(response);
	}
	
}
