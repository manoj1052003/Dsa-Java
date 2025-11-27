package com.onlinejavapro;

public class class15 {
	
	public static int add_digit(int num) {  
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
		int num1 = 99;
		int num2 = num1+1;
		while(add_digit(num1)*2 != add_digit(num2)) {
			num2++;
		}
		System.out.println(num2);
		
		
	}

}
