package com.timecom;

public class first {

	public static void main(String[] args) {
		int a = 45;
		int b = 18;
		
		while(a != 0 && b != 0) {
			if(a > b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		if(a !=0) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
	}
}
