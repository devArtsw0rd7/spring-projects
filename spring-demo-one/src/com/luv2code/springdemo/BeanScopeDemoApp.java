package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		
		// Retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are same
		boolean result = (theCoach == alphaCoach);
		
		// print out results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach" + theCoach);
		
		System.out.println("\nMemory location for alphaCoach" + alphaCoach);
		
		// Close the context
		context.close();
	}

}

