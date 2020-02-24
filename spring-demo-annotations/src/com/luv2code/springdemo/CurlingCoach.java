package com.luv2code.springdemo;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

//@Component
public class CurlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Constructor that takes dependency as parameter
	
	//@Autowired
	public CurlingCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Skipper says sweep the pebbles!";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
