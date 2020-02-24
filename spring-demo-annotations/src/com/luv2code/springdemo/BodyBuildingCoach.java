package com.luv2code.springdemo;

public class BodyBuildingCoach implements Coach {

	FortuneService fortuneService;
	
	
	public BodyBuildingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Lift heavy stuff...";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}

}
