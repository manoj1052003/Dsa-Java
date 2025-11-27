package com.arrays;

public class deloitte {
	
	public static int add_digit(int num) {
		int res = 0;
		while(num>0) {
			res +=num%10;
			num/=10;
		}
		return res;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		int num1 = num+1;
		int res1 = add_digit(num);
		int res2 = add_digit(num1);
		while(res1*2!=res2) {
			num1++;
			res2 = add_digit(num1);
			
		}
		System.out.println(num1);
		

	}

}
