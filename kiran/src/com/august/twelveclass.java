package com.august;

public class twelveclass {

	public static int d_sum(int num) {
		int sum = 0;
		while(num!=0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		int num1= num+1;
		while(d_sum(num)*2 != d_sum(num1)) {
			num1++;
		}
		System.out.println(num1);
		
		
		
	}

}
