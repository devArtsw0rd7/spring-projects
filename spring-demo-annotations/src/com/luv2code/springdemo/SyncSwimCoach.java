package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SyncSwimCoach implements Coach {

	private FortuneService fortuneService;
	
	// Field-level injection from sports.properties file
	@Value("${swim.email}")
	private String email;
	
	@Value("${swim.team}")
	private String team;
	
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	
	public SyncSwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Do the robot while swimming 1000 meters!";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}

}
