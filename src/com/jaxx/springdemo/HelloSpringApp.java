package com.jaxx.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// Retrieve bean from Spring container
		Coach trackCoach = context.getBean("track", Coach.class);
		Coach baseballCoach = context.getBean("baseball", BaseballCoach.class);
		Coach volleyballCoach = context.getBean("volleyball", VolleyballCoach.class);

		// Track method and injection
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		
		// Baseball method and injection
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		
		// Volleyball method and injection
		System.out.println(volleyballCoach.getDailyWorkout());
		System.out.println(volleyballCoach.getDailyFortune());
		
		// Close context
		context.close();
	}
}
