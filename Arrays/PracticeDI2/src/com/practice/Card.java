package com.practice;

public class Card implements Payment{

	@Override
	public void pay() {
		System.out.println("paid through card");
		
	}

}
