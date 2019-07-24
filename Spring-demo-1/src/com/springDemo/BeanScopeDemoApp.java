package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		
		//load the spring config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		
		//retrieve bean from spring container

		
		Coach theCoach =context.getBean("myCoach" , Coach.class);
		
		Coach alphaCoach =context.getBean("myCoach" , Coach.class);
		
		
		boolean result = (theCoach == alphaCoach);
		
		
		System.out.println("pointing to the same object: " + result);
		
		context.close();
	}

}
