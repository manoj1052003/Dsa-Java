package com.novdec;

public class sat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 2; num < 1000; num++) {
			
			boolean res = true;
			
			for (int i = 2; i < num; i++) {
				
				if (num % i == 0) {
					res = false;
					break;
				}
			
			}
			if (res == true) {
				System.out.println(num);
			}
		}
		
		
		

	}
	
}
