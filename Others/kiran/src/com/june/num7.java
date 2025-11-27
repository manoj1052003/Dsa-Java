package com.june;

public class num7 {
	
	public static boolean check_prime(int num) {
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		boolean res = check_prime(num);
		System.out.println(res);
	}

}
