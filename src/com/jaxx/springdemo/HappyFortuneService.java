package com.jaxx.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		String[] fortunes = {
				"You will have a great day!",
				"There is a win in sight.",
				"You are amazing"
		};
		
		Random rn = new Random();
		int randFortune = rn.nextInt(fortunes.length);
		
		return fortunes[randFortune];
	}
	
}
