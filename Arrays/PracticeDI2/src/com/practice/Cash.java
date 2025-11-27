package com.practice;

public class Cash implements Payment{

	@Override
	public void pay() {
		System.out.println("paid through cash");
		
	}

}
