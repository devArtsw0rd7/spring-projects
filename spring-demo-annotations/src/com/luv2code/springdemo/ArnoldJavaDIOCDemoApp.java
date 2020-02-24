package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArnoldJavaDIOCDemoApp {

	public static void main(String[] args) {
		
		// Read Spring configuration Java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ArnoldConfig.class);

		// Retrieve bean from container
		BodyBuildingCoach theCoach = context.getBean("bodyBuildingCoach", BodyBuildingCoach.class);
		
		// Call Methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getSchwarzeneggerFortune());
		
		// close the context
		context.close();
	}

}
