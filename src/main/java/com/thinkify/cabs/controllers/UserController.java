package com.thinkify.cabs.controllers;

import java.util.List;

import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.models.User;
import com.thinkify.cabs.requests.ChooseRideRequest;
import com.thinkify.cabs.requests.FindRideRequest;

public interface UserController {

	User addUser(User user);
	
	List<Partner> findRide(FindRideRequest locationData);
	
	Ride chooseRide(ChooseRideRequest chooseRequestRequest);
	
	List<User> getUsers();
}
