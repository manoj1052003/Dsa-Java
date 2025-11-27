package com.novdec.number;

public class primenum {
	
	public static boolean check_prime(int num) {
		
		boolean res = true;
		for (int i = 2; i < num ; i++) {
			if (num%i==0) {
				res = false;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		boolean res = check_prime(num);
		if (res == true) {
			System.out.println("its prime");
		}
		else {
			System.out.println("its not");
		}
		
	}

}
