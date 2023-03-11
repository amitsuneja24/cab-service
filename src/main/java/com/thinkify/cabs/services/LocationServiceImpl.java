package com.thinkify.cabs.services;

import org.springframework.stereotype.Service;

import com.thinkify.cabs.models.Location;

@Service
public class LocationServiceImpl implements LocationService {

	@Override
	public int findDistance(Location start, Location end) {
		int x1 = Integer.parseInt(start.getLatitude()), y1 = Integer.parseInt(start.getLongitude());
		int x2 = Integer.parseInt(end.getLatitude()), y2 = Integer.parseInt(end.getLongitude());
		int distance = (int) Math.ceil(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
		return distance;
	}

}
