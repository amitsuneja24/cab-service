package com.thinkify.cabs.services;

import java.util.List;

import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.models.User;

public interface UserService {

	User addUser(User user);

	List<Partner> findRide(Location startLocation, Location endLocation);

	Ride chooseRide(String partnerId, String userId, Location startLocation, Location endLocation);
	
	List<User> getUsers();

}
