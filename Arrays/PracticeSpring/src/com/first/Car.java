package com.first;

public class Car {

	Engine e ;
	
	public Car(Engine e) {
		this .e = e;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void getE() {
		e.start();
	}



	public void setE(Engine e) {
		this.e = e;
	}



	
	

}
