package com.idiazone.user.service;

import java.util.List;

import com.idiazone.user.model.User;

public interface UserService {

	public List<User> getAllUsers();

	public User getUserById(Integer userId);

}
