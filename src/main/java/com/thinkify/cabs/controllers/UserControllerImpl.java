package com.thinkify.cabs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.models.User;
import com.thinkify.cabs.requests.ChooseRideRequest;
import com.thinkify.cabs.requests.FindRideRequest;
import com.thinkify.cabs.services.UserService;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService userService;
	
	@Override
	@PostMapping(path = "/add")
	public User addUser(@RequestBody User user) {
		User userData = userService.addUser(user);
		return userData;		
	}

	@Override
	@PostMapping(path = "/find-ride")
	public List<Partner> findRide(@RequestBody FindRideRequest findRideRequest) {
	Location startLocation = findRideRequest.getStartLocation();
	Location endLocation = findRideRequest.getEndLocation();
	List<Partner> partners = userService.findRide(startLocation, endLocation);
	return partners;
	}

	@Override
	@PostMapping(path = "/choose-ride")
	public Ride chooseRide(@RequestBody ChooseRideRequest chooseRideRequest) {
		Ride ride = userService.chooseRide(chooseRideRequest.getPartnerId(), chooseRideRequest.getUserId(), chooseRideRequest.getStartLocation(), chooseRideRequest.getEndLocation());
		return ride;
	}

	@Override
	@GetMapping(path = "/get")
	public List<User> getUsers() {
		List<User> users =  userService.getUsers();
		return users;
	}

}
