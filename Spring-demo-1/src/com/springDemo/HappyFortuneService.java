package com.springDemo;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService{

	
	String [] fortunes = {
			"be happy","be more happy","be happies"
			};
	
	
	
	
	
	@Override
	public String getFortune() {
	    int rnd = new Random().nextInt(fortunes.length);
	    return fortunes[rnd];
	}
	
	

}




