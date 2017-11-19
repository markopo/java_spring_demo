package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		
		// create the object 
		Coach theCoach = context.getBean("cricketCoach", Coach.class);
		
		// use the object 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
			
	}

}
