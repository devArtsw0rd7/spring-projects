package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get bean from Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		// Close context
		context.close();
	}

}
