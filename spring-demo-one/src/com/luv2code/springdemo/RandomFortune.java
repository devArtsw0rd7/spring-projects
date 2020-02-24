package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	private String[] fortunes = {
			"Fortune #1",
			"Fortune #2", 
			"Fortune #3"
	};
	
	private Random r = new Random();
	
			
	@Override
	public String getFortune() {
		int randomNumber = r.nextInt(fortunes.length);
		String theFortune = fortunes[randomNumber];
		return theFortune;
	}

}
