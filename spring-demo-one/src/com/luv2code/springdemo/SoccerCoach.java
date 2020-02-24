package com.luv2code.springdemo;

public class SoccerCoach implements Coach{
	
	//define a private field
	private FortuneService fortuneService;
	
	//Constructor	
	public SoccerCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Stretches, down & backs, sprints, ball work, scrimmage";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
