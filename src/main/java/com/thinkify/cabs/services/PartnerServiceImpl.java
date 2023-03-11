package com.thinkify.cabs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.repository.PartnerRepository;
import com.thinkify.cabs.repository.RideRepository;

@Service
public class PartnerServiceImpl implements PartnerService {

	@Autowired
	PartnerRepository partnerRepository;
	
	@Autowired
	RideRepository rideRepository;
	
	@Override
	public Partner addPartner(Partner partner) {
		return partnerRepository.addPartner(partner);
		
	}

	@Override
	public Partner endRide(String rideId, Location endLocation) {
		String partnerId = rideRepository.getRide(rideId).getPartnerId();
		Partner partner = partnerRepository.getPartner(partnerId);
		partner.setAvailable(true);
		partner.setLocation(endLocation);
		return partnerRepository.updatePartner(partner);		
	}

	@Override
	public List<Partner> getPartners() {
		return partnerRepository.getPartners();
	}

	@Override
	public List<Ride> getRides() {
		return rideRepository.getRides();
	}

}
