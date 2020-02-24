package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// An an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Do my startup stuff.");
	}
	// Add a custom destroy method (not called with prototype)
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Do my cleanup stuff!");
	}
}










