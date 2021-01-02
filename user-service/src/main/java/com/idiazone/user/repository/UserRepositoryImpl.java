package com.idiazone.user.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.idiazone.user.exception.InvalidUserException;
import com.idiazone.user.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	Map<Integer,User> users = new HashMap<>();
	
	@PostConstruct
	public void init() {
		users.put(1, new User(1,"Rajesh","Shinde","rajesh"));
		users.put(2, new User(2,"Mahesh","Shinde","mahesh"));
		users.put(3, new User(3,"Priti","Shinde","priti"));
	}
	
	

	@Override
	public List<User> getAllUsers() {

		return users.entrySet().parallelStream().map(e -> e.getValue()).collect(Collectors.toList());
	}

	@Override
	public User getUserById(Integer userId) {
		User user =  users.get(userId);
		if(user == null) {
			throw new InvalidUserException(userId, null, "Not Persent", this.getClass());
		}
		return user;
	}

}
