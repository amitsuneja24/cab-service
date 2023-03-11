package com.thinkify.cabs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.requests.EndRideRequest;
import com.thinkify.cabs.services.PartnerService;

@RestController
@RequestMapping(path = "/api/v1/partner")
public class PartnerControllerImpl implements PartnerController {

	@Autowired
	private PartnerService partnerService;
	
	@Override
	@PostMapping(path = "/add")
	public Partner addPartner(@RequestBody Partner partner) {
		Partner partnerData = partnerService.addPartner(partner); 
		return partnerData;
	}

	@Override
	@PostMapping(path = "/end-ride")
	public Partner endRide(@RequestBody EndRideRequest endRideRequest) {
		Partner partner = partnerService.endRide(endRideRequest.getRideId(), endRideRequest.getEndLocation());
		return partner;
	}

	@Override
	@GetMapping(path = "/get-partners")
	public List<Partner> getPartners() {
		List<Partner> partners = partnerService.getPartners();
		return partners;
	}

	@Override
	@GetMapping(path = "/get-rides")
	public List<Ride> getRides() {
		List<Ride> rides = partnerService.getRides();
		return rides;
	}

}
