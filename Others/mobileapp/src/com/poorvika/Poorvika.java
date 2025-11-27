package com.poorvika;

public class Poorvika {
	
	public static Mobile get_mobile(String mymobile) {
		if(mymobile.equalsIgnoreCase("kidney")) {
			return new Iphone();
		}
		else if(mymobile.equalsIgnoreCase("eye")) {
			return new Samsung();
		}
		else {
			System.out.println("try selling another organ");
			return null;
		}
	}

}
