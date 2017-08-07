package com.rohitbelapurkar.springdemo.domain;

import com.rohitbelapurkar.springdemo.service.BusinessService;

public class Organization {
	
	private String companyName;
	private int yearOfIncorporation;
	private int postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	
	//Constructor for this class
	public Organization(String companyName, int yearOfIncorporation) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}

	public String corporateSlogan() {
		return slogan;
	}
	
	public String corporateService() {
		return businessService.offerService(companyName);
	}
}
