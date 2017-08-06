package com.rohitbelapurkar.mavendemo;

public class Organization {
	
	private String companyName;
	private int yearOfIncorporation;
	private int postalCode;
	private int employeeCount;
	
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

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}

	public void corporateSlogan() {
		String slogan = "We build ultimate driving machines";
		System.out.println(slogan);
	}
}
