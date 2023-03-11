package com.thinkify.cabs.repository;

import java.util.List;

import com.thinkify.cabs.models.Ride;

public interface RideRepository {

	Ride addRide(Ride ride);

	Ride updateRide(Ride ride);

	Ride getRide(String id);

	List<Ride> getRides();
}
