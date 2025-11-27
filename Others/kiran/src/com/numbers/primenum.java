package com.numbers;

public class primenum {
	
	static boolean check_prime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num %i ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num =2; num <=10000; num++) {
			
			boolean res = check_prime(num);
			
			if (res == true) {
				
				System.out.println(num);
			}
		}
		
	}

}
