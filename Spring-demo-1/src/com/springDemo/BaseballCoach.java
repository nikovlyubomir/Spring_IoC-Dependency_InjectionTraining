package com.springDemo;

public class BaseballCoach implements Coach {
	
	// define a private field for dependency
	
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
@Override
public String getDailyWorkout() {
	return "Spend 30 minutes on batting practice";
}

@Override
public int getWeeklyProtein() {
	return 10;
}

@Override
public String getDailyFortune() {
	
	//use my fortuneService to get a fortune
	
	return fortuneService.getFortune();
}
}
