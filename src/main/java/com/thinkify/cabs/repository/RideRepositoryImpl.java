package com.thinkify.cabs.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.thinkify.cabs.models.Ride;

@Repository
public class RideRepositoryImpl implements RideRepository {

	private Map<String, Ride> rides;
	
	@Override
	public Ride addRide(Ride ride) {
		ride.setRideId(String.valueOf(rides.size()+1));		
		rides.put(ride.getRideId(),ride);
		return ride;
	}

	@Override
	public Ride updateRide(Ride ride) {
		rides.put(ride.getRideId(),ride);
		return ride;
	}

	@Override
	public Ride getRide(String id) {		
		return rides.get(id);
	}

	@Override
	public List<Ride> getRides() {
		return new ArrayList<>(rides.values());
	}

	public RideRepositoryImpl() {
	rides = new HashMap<>();
	}

	
	
}
