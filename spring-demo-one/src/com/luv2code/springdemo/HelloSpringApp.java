package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoachOther",Coach.class); 
		
		//call methods on the bean
		System.out.println(theCoach2.getDailyWorkout());
		
		
		//let's call our new methods for fortunes
		
		System.out.println(theCoach2.getDailyFortune());
		//System.out.println(theCoach2.getDailyWorkout());
		
		
		
		//close the context
		context.close();

	}

}
