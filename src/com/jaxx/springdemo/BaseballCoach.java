package com.jaxx.springdemo;

public class BaseballCoach implements Coach {
	
	// Define private field for dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}
	
	// Constructor
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use fortuneService to give fortune
		return fortuneService.getFortune();
	}
	
}
