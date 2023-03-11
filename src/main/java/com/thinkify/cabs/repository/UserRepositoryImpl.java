package com.thinkify.cabs.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.thinkify.cabs.models.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private Map<String, User> users;

	@Override
	public User addUser(User user) {
		user.setId(String.valueOf(users.size()+1));
		users.put(user.getId(), user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		users.put(user.getId(), user);
		return user;
	}

	@Override
	public User getUser(String id) {
		return users.get(id);
	}

	@Override
	public User deleteUser(String id) {
		User user = users.get(id);
		users.remove(id);
		return user;
	}

	public UserRepositoryImpl() {
		users = new HashMap<>();
		User user = new User("Mohit","Singh","M","9876356726","mohitsingh@gmail.com");
		addUser(user);
	}

	@Override
	public List<User> getUsers() {
		return new ArrayList<>(users.values());
	}

}
