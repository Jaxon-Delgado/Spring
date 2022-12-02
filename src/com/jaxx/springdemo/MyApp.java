package com.jaxx.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the object
		Coach theCoach = new TrackCoach();
		Coach baseballCoach = new BaseballCoach();
		
		// Use the object
		//System.out.println(theCoach.getDailyWorkout());
		//System.out.println(baseballCoach.getDailyWorkout());
	}

}
