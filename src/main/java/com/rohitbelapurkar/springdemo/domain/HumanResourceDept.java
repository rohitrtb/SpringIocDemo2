package com.rohitbelapurkar.springdemo.domain;

import com.rohitbelapurkar.springdemo.service.RecruitmentService;

public class HumanResourceDept implements Department {
	
	private String departmentName;
	private RecruitmentService recruitmentService;
	private Organization organization;
	
	public HumanResourceDept(RecruitmentService recruitmentService, Organization organization) {
		super();
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(), departmentName, numberOfRecruitments);
		return hiringFacts;
	}
}
