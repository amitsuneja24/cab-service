package com.thinkify.cabs.requests;

import com.thinkify.cabs.models.Location;

public class FindRideRequest {

	private Location startLocation;
	private Location endLocation;
	
	public FindRideRequest() {
	}

	public FindRideRequest(Location startLocation, Location endLocation) {
		this.startLocation = startLocation;
		this.endLocation = endLocation;
	}

	public Location getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(Location startLocation) {
		this.startLocation = startLocation;
	}

	public Location getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(Location endLocation) {
		this.endLocation = endLocation;
	}
	
}
