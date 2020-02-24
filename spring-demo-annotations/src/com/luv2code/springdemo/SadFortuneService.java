package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Ummm... you need to practice more, Buck-o!";
	}

}
