package com.novdec;

public class hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int hcf = 1;
		int smallest = 0;
		
		if (a < b) {
			smallest = a;
		}
		else {
			smallest = b;
		}
			
		for (int i = 1; i <= smallest; i++) {
			
			if (a%i==0 && b%i==0) {
				
				hcf = i;
			}
		}
		
		System.out.println(hcf);

	}

}
