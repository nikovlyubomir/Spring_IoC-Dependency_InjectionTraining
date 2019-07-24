package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		//CricketCoach theCoach = context.getBean("IvanCoach", CricketCoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...
		
		
		
//
						
		// close the context
		context.close();
	}

}






