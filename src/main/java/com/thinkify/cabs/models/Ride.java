package com.thinkify.cabs.models;

public class Ride {

	private String rideId;
	private String userId;
	private String partnerId;
	private Location startLocation;
	private Location endLocation;

	public Ride() {
	}

	public Ride(String userId, String partnerId, Location startLocation, Location endLocation) {
		super();
		this.userId = userId;
		this.partnerId = partnerId;
		this.startLocation = startLocation;
		this.endLocation = endLocation;	
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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

	public String getRideId() {
		return rideId;
	}

	public void setRideId(String rideId) {
		this.rideId = rideId;
	}

}
