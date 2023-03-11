package com.thinkify.cabs.repository;

import java.util.List;

import com.thinkify.cabs.models.Partner;

public interface PartnerRepository {

	Partner addPartner(Partner partner);

	Partner updatePartner(Partner partner);

	Partner getPartner(String id);

	Partner deletePartner(String id);
    
	List<Partner> getPartners();
}
