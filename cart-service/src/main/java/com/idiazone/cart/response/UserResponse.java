package com.idiazone.cart.response;

import java.util.List;

import com.idiazone.cart.model.User;

public class UserResponse extends BaseResponse {
	
	private List<User> users;
	
	private User user;
	
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

}
