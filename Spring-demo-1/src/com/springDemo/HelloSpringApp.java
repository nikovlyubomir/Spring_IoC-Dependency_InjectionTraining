package com.springDemo;
import org.springframework.*;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file
		
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		
		Coach theCoach=context.getBean("IvanCoach" , CricketCoach.class);
		
		
		
		//call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyFortune());
        
		
		
		
		//close the context
		context.close();

	}

}
