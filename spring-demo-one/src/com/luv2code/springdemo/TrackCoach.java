package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	//this is constructor injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
	System.out.println("Trackcoach: inside method doMyStartupStuff");	
	}
	
	//add a destroy method
	public void doMyCleanupStuffYo() {
		System.out.println("TrackCoach: inside doMyClean method");
	}
	
	

}
