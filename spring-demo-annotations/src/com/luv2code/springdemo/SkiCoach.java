package com.luv2code.springdemo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;

//@Component
public class SkiCoach implements Coach {

	//@Autowired
	@Qualifier("randomSportsFortuneService")
	private FortuneService fortuneService;
	
	// Default constructor
	public SkiCoach() {
		System.out.println("SkiCoach: inside default constructor");
	}
	@Override
	public String getDailyWorkout() {
		
		return "Stretch, then hit the slopes!";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}

}
