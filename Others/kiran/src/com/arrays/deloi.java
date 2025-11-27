package com.arrays;

public class deloi {
	
	public static int add_digit(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num % 10;
			sum = sum + rem;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 99;
		int num2 = num1+1;
		int res1 = add_digit(num1);
		int res2 = add_digit(num2);
		while(res1*2!=res2) {
			num2++;
			res2 = add_digit(num2);
		}
		System.out.println(num2);
		
		

	}

}
