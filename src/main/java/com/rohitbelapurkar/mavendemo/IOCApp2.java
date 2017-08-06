package com.rohitbelapurkar.mavendemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp2 {

	public static void main(String[] args) {
		//create application context 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) context.getBean("myorg");
		
		org.corporateSlogan();
		
		//Close the application context
		((ClassPathXmlApplicationContext)context).close();
	}
}
