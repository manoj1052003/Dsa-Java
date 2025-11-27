package com.march;

public class recfirst {
	
	public static int  fact(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		
		return fact(num-1)*num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int n = fact(num);
		System.out.println(n);
		
	}

}
