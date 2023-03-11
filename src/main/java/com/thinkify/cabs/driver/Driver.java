package com.thinkify.cabs.driver;

import org.springframework.beans.factory.annotation.Autowired;

import com.thinkify.cabs.models.Car;
import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;
import com.thinkify.cabs.models.User;
import com.thinkify.cabs.repository.PartnerRepository;
import com.thinkify.cabs.repository.UserRepository;

public class Driver {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PartnerRepository partnerRepository;
	
    public void addData() {
    	User user = new User("Mohit","Singh","M","9876356726","mohitsingh@gmail.com"); 
    	Partner partner = new Partner("Abhishek","Singh","M","8736472718","abhisheksingh@gmail.com",true, new Location("1","2"),new Car("Maruti","Swift","2020","CNG"));
    	userRepository.addUser(user);
    	partnerRepository.addPartner(partner);
    }

	public Driver() {
	} 
    
    
}
