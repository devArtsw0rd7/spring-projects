package com.luv2code.springdemo;

//import org.springframework.stereotype.Component;

//@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}

}
