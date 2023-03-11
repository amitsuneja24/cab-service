package com.thinkify.cabs.controllers;

import java.util.List;

import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.requests.EndRideRequest;

public interface PartnerController {

	Partner addPartner(Partner partner);
	
	Partner endRide(EndRideRequest endrideRequest);
	
	List<Partner> getPartners();
	
	List<Ride> getRides();
}
