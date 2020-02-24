package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArnoldConfig {
		// Define bean for Arnold Fortune Service
			@Bean
			public FortuneService schwarzeneggerFortuneService() {
				return new SchwarzeneggerFortuneService();
			}
			
			//Define bean for BodyBuildingCoach AND inject dependency
			@Bean
			public Coach bodyBuildingCoach() {
				return new BodyBuildingCoach(schwarzeneggerFortuneService());
			}
}
