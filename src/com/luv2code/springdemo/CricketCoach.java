package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService; 
	
	public CricketCoach() {
		System.out.println("cricket contstr"); 
	}

	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket setter fortune"); 
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes"; 
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune(); 
	}

}
