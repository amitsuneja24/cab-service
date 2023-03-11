package com.thinkify.cabs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.Ride;
import com.thinkify.cabs.models.User;
import com.thinkify.cabs.repository.PartnerRepository;
import com.thinkify.cabs.repository.RideRepository;
import com.thinkify.cabs.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PartnerRepository partnerRepository;
	
	@Autowired
	private RideRepository rideRepository;
	
	@Autowired
	LocationService locationService;
	
	@Override
	public User addUser(User user) {
		return userRepository.addUser(user);		
	}

	@Override
	public List<Partner> findRide(Location startLocation, Location endLocation) {
		List<Partner> partners = new ArrayList<>();
		for(Partner partner : partnerRepository.getPartners())
		{
			if(partner.isAvailable() && locationService.findDistance(startLocation, partner.getLocation()) <= 5)
				partners.add(partner);
		}
		return partners;
	}

	@Override
	public Ride chooseRide(String partnerId, String userId, Location startLocation, Location endLocation) {
		Partner partner = partnerRepository.getPartner(partnerId);
	    partner.setAvailable(false);
	    partnerRepository.updatePartner(partner);
	    return rideRepository.addRide(new Ride(userId, partner.getId(), startLocation, endLocation));		
	}

	@Override
	public List<User> getUsers() {
		return userRepository.getUsers();
		
	}

}
