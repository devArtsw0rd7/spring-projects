package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
@ComponentScan("com.luv2code.springdemo")
public class SportConfig {

		// Define bean for Sad Fortune Service
		@Bean
		public FortuneService sadFortuneService() {
			return new SadFortuneService();
		}
		
		//Define bean for SyncSwimCoach AND inject dependency
		@Bean
		public Coach syncSwimCoach() {
			return new SyncSwimCoach(sadFortuneService());
		}
}
