package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load spring container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
				
		
		// Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getSchwarzeneggerFortune());
		
		// close the context
		context.close();

	}

}
