package com.indian.cars;

public class car {
	
	public static Engine carEngine(String enginename) {
		if(enginename.equalsIgnoreCase("PetrolEngine")) {
			return new PetrolEngine();
		}
		else if(enginename.equalsIgnoreCase("DieselEngine")) {
			return new DieselEngine();
		}
		else {
			System.out.println("not available");
			return null;
		}
	}

}
