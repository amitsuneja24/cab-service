package com.thinkify.cabs.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.thinkify.cabs.models.Car;
import com.thinkify.cabs.models.Location;
import com.thinkify.cabs.models.Partner;

@Repository
public class PartnerRepositoryImpl implements PartnerRepository {

	private Map<String, Partner> partners;

	@Override
	public Partner addPartner(Partner partner) {
		partner.setId(String.valueOf(partners.size()+1));
		partners.put(partner.getId(), partner);
		return partner;
	}

	@Override
	public Partner updatePartner(Partner partner) {
		partners.put(partner.getId(), partner);
		return partner;
	}

	@Override
	public Partner getPartner(String id) {
		return partners.get(id);
	}

	@Override
	public Partner deletePartner(String id) {
		Partner partner = partners.get(id);
		partners.remove(id);
		return partner;
	}

	@Override
	public List<Partner> getPartners() {		
		return new ArrayList<>(partners.values());
	}

	public PartnerRepositoryImpl() {
	    partners = new HashMap<>();
	    Partner partner = new Partner("Abhishek","Singh","M","8736472718","abhisheksingh@gmail.com",true, new Location("1","2"),new Car("Maruti","Swift","2020","CNG"));
	    addPartner(partner);
	}
	
	

}
