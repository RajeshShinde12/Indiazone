package com.idiazone.user.repository;

import java.util.List;

import com.idiazone.user.model.User;

public interface UserRepository {

	public List<User> getAllUsers();

	public User getUserById(Integer userId);

}
