package com.basics;

public class conditional {

	public static void main(String[] args) {
		int per = 90;
		
		if(per >= 85) {
			System.out.println("Dist");
		}
		else if(per >= 60) {
			System.out.println("first class");
		}
		else if(per >= 35) {
			System.out.println("just pass");
		}
		else {
			System.out.println("just fail");
		}
	}
}
