package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjectionAnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get the bean from the container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getSchwarzeneggerFortune());
		
		// Call methods for string injection from sports.properties
		// Call new methods for literal injection
		System.out.println("Coach Email: " + ((SwimCoach) theCoach).getEmail());
		System.out.println("Team name: " + ((SwimCoach) theCoach).getTeam());
		// close the context
		context.close();

	}

}
