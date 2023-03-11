package com.thinkify.cabs.services;

import java.util.List;

import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;

public interface PartnerService {

	Partner addPartner(Partner partner);
	
	Partner endRide(String rideId, Location endLocation);
	
	List<Partner> getPartners();
	
	List<Ride> getRides();
}
