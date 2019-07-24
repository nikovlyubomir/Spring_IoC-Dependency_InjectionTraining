package com.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;	
	
	private String emailAdress;
	private String team;
	
	
	// create a no-arg constructor
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	public CricketCoach() {
	}
	
	
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public int getWeeklyProtein() {
		// TODO Auto-generated method stub
		return 0;
	}


}
