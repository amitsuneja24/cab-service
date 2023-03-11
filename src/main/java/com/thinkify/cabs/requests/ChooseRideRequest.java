package com.thinkify.cabs.requests;

import com.thinkify.cabs.models.Location;

public class ChooseRideRequest {

	private String partnerId;
	private String userId;
	private Location startLocation;
	private Location endLocation;
	
	public ChooseRideRequest() {
	
	}

	public ChooseRideRequest(String partnerId, String userId, Location startLocation, Location endLocation) {
		super();
		this.partnerId = partnerId;
		this.userId = userId;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
