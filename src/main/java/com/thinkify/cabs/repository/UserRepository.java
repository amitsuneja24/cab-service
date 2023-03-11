package com.thinkify.cabs.repository;

import java.util.List;

import com.thinkify.cabs.models.User;

public interface UserRepository {

	User addUser(User user);

	User updateUser(User user);

	User getUser(String id);

	User deleteUser(String id);
	
	List<User> getUsers();
}
