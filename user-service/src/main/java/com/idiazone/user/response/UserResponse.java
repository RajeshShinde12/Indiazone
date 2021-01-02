package com.idiazone.user.response;

import java.util.List;

import com.idiazone.user.model.User;

public class UserResponse {
	
	private List<User> users;
	
	private User user;
	
	private Status status;
	
	private String message;
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
