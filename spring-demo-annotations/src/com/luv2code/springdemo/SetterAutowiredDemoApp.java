package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAutowiredDemoApp {

	public static void main(String[] args) {
		
		// Read Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get bean from Spring container
		Coach theCoach = context.getBean("speedSkatingCoach", Coach.class);
		
		// Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getSchwarzeneggerFortune());
		// Close context
		context.close();


	}

}
