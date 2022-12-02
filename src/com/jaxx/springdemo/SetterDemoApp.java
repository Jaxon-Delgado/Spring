package com.jaxx.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		VolleyballCoach coach = context.getBean("volleyball", VolleyballCoach.class);

		System.out.println("Workout: " + coach.getDailyWorkout());
		System.out.println("Fortune: " + coach.getDailyFortune());
		System.out.println("Email: " + coach.getEmailAddress());
		System.out.println("Team Name: " + coach.getTeam());

		context.close();
	}

}
