package com.thinkify.cabs.requests;

import com.thinkify.cabs.models.Location;

public class EndRideRequest {
	private String rideId;
	private Location endLocation;
	
	public EndRideRequest() {
	
	}
	
	public EndRideRequest(String rideId, Location endLocation) {	
		this.rideId = rideId;
		this.endLocation = endLocation;
	}



	public String getRideId() {
		return rideId;
	}

	public void setRideId(String rideId) {
		this.rideId = rideId;
	}

	public Location getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(Location endLocation) {
		this.endLocation = endLocation;
	}
	
	
}
