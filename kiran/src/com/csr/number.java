package com.csr;


public class number {
	public static boolean check_prime(int num) {
		for (int i=2; i<num;i++) {
			if (num%i==0) {
				return false;
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k=2; k<=10000; k++) {
			int num = k;
			boolean res=check_prime(num);
			if (res==true) {
				System.out.println(num);
		}
		
		}
		
	}

}
