package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Java configuration class file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get bean from Spring container
		SyncSwimCoach theCoach = context.getBean("syncSwimCoach", SyncSwimCoach.class);
		
		// Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getSchwarzeneggerFortune());
		
		// Field-level injection for email and team name
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		// Close context
		context.close();
	}

}
