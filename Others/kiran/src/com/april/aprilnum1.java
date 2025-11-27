package com.april;

public class aprilnum1 {
	
	public static int find_perfect(int num) {
		int res = 0;
		for (int i=1; i<num; i++) {
			if(num%i==0) {
				res = res+i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// multiplication table
		int n = 153;
		int digit = 0;
		while(n!=0) {
			n=n/10;
			digit=digit + 1;
		}
		System.out.println(digit);

	}

}
