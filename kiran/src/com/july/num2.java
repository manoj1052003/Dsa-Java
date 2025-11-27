package com.july;

public class num2 {
	public static boolean c_prime(int num) {
		// if conditions for the edge cases
		if(num <=1) {
			return false;
		}
		
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		boolean res = c_prime(num);
		if(res) {
			System.out.println("its prime");
		}
		else {
			System.out.println("its not");
		}
		
		
		
	}
}
