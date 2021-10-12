package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	@Override
	public String getFortune() {
		
		String[] fortunes = {"Today bad day","Today a normal day","Today a very good Day my friend"};
		// TODO Auto-generated method stub
		return fortunes[new Random().nextInt(fortunes.length)];
	}


}
