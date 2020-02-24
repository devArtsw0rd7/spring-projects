package com.luv2code.springdemo;



import java.nio.file.*;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach {

	@Value("${swim.email}")
	private String email;
	
	@Value("${swim.team}")
	private String team;
	
	private String fileName = "src/com/luv2code/springdemo/sportsFortunes.txt";
	
	//@Autowired
	@Qualifier("randomSportsFortuneService")
	FortuneService fortuneService;
	
	public SwimCoach() {
		System.out.println("SwimCoach: inside default constructor");
	}
	
	@PostConstruct
	public void doCustomSetupStuff()throws Exception {
		System.out.println("SwimCoach: inside doCustomSetupStuff");
		String data = new String(Files.readAllBytes(Paths.get(fileName))); 
		System.out.println(data); 
	} 

	@PreDestroy
	public void doCustomCleanupStuff() {
		System.out.println("SwimCoach: inside doCustomCleanupStuff");
	}
	// Setters for String injection from properties file
	
	public void setEmail(String email) {
		this.email = email;
		System.out.println("SwimCoach: inside setEmail");
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("SwimCoach: inside setTeam");
	}
	
	// Getter methods
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "CARDIO CARDIO CARDIO, then hold your breath!";
	}

	@Override
	public String getSchwarzeneggerFortune() {
		
		return fortuneService.getFortune();
	}

}
