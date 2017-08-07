package com.rohitbelapurkar.springdemo.serviceImpl;

import java.util.Random;

import com.rohitbelapurkar.springdemo.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + random.nextInt(numberOfRecruitments) + " employess using various referrals\n";
		return hiringFacts;
	}

}
