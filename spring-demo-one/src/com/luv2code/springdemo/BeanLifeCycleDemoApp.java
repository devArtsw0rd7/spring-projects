package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// Load Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecycle-ApplicationContext.xml");
		
		// Retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Use the bean
		System.out.println(theCoach.getDailyWorkout());
		// Close the context
		context.close();
	}

}

