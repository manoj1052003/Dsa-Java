package com.first;

public class TestCar {

	public static void main(String[] args) {
		
		DieselEngine de = new DieselEngine();
		
		PetrolEngine pe = new PetrolEngine();
		
		Car c = new Car(pe);
		
//		c.setE(de);
//		
		c.getE();

	}

}
