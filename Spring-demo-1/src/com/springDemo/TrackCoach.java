package com.springDemo;

public class TrackCoach implements Coach {
	
	
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}
	@Override
	public int getWeeklyProtein() {
		return 10;
	}
	@Override
	public String getDailyFortune() {
		return  "Just do it " + fortuneService.getFortune();
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}


}
