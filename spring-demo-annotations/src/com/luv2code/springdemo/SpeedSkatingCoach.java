package com.luv2code.springdemo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component

public class SpeedSkatingCoach implements Coach {

	private FortuneService fortuneService;
	
	// Default Constructor
	public SpeedSkatingCoach() {
		System.out.println("SpeedSkatingCoach: inside default constructor");
	}
	
	// Dependency injection with any method that has the @ Autowired annotation 

	//@Autowired
	public void useAnyMethodForInjection(FortuneService fortuneService) {
		System.out.println("SpeedSkatingCoach: inside useAnyMethodForInjection() method");
		this.fortuneService = fortuneService;
	}
	// Setter injection with annotations occurs here!
	/*
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("SpeedSkatingCoach: inside setFortuneService");
	}
	*/

	@Override
	public String getDailyWorkout() {
		
		return "Hit the cardio!";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}
	

}
