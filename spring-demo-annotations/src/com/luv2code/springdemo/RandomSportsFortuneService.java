package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSportsFortuneService implements FortuneService {

	private String[] fortunes = {
			"I don't count my situps. I only start counting once it starts hurting because they're the only ones that count. -Muhammad Ali",
			"I've failed over and over again in my life. And that is why I succeed. -Michael Jordan", 
			"The only way to prove you are a good sport is to lose. -Ernie Banks",
			"It's not whether you get knocked down; it's whether you get up. -Vince Lombardi",
			"Age is no barrier. It's a limitation you put on your mind. -Jackie Joyner-Kersee",
			"You have to do something in your life that is honorable and not cowardly if you are to live in peace with yourself. -Larry Brown"
	};
	
	Random r = new Random();
	
	@Override
	public String getFortune() {
		int randomIndex = r.nextInt(fortunes.length);
		String sportsFortune = fortunes[randomIndex];
		return sportsFortune;
	}

}
