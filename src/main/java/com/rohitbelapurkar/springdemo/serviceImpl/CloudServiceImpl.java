package com.rohitbelapurkar.springdemo.serviceImpl;

import java.util.Random;

import com.rohitbelapurkar.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organization, " + companyName + " offers world class Cloud Computing infrastructure." +
						 "\nThe annual number exceeds " + random.nextInt(revenue) + "dollars.";
		return service;
	}

}
