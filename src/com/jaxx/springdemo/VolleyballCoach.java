package com.jaxx.springdemo;

public class VolleyballCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public VolleyballCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Start up backrow 4's";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
	

}
