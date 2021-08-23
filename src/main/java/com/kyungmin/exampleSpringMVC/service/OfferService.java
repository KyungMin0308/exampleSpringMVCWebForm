package com.kyungmin.exampleSpringMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyungmin.exampleSpringMVC.dao.OfferDao;
import com.kyungmin.exampleSpringMVC.model.Offer;

@Service
public class OfferService {
	
	@Autowired
	private OfferDao offerDao;
	
	public List<Offer> getCurrent() {
		return offerDao.getAllOffer();
	}
	
	public void insert(Offer offer) {
		offerDao.insert(offer);
	}

}
