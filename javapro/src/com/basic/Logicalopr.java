package com.basic;

public class Logicalopr {
	
	public static int reverse(int num) {
		int res = 0;
		while(num !=0 ) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num /= 10;
		}
		//System.out.println(num+" method num");
		return res;
	}

	public static void main(String[] args) {
		for(int k=1; k<=10000; k++) {
			int num = k;
			int res = reverse(num);
			if(res == num) {
				System.out.println(num);
			}

		}
		
		
	}

}
