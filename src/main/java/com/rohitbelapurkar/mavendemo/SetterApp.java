package com.rohitbelapurkar.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohitbelapurkar.springdemo.domain.Organization;

public class SetterApp {
	
	public static void main(String[] args) {
		//getting the application context from the class path
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Getting the bean from the IOC container
		Organization org = (Organization) context.getBean("myorg");
		
		//calling the corporateSlogan method to print out the slogan message
		System.out.println(org.corporateSlogan());
		
		//Print organization details
		System.out.println(org);
		
		System.out.println(org.corporateService());
		
		//Close the application context
		((ClassPathXmlApplicationContext)context).close();
	}

}
