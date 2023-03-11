package com.thinkify.cabs.services;

import com.thinkify.cabs.models.Location;

public interface LocationService {
	int findDistance(Location start, Location end);
}
