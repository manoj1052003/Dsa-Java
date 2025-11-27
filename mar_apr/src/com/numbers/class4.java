package com.numbers;

public class class4 {
	
	public static int c_digit(int num) {
		int count = 0;
		while(num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public static int find_arm(int num) {
		int res = 0;
		int digit = c_digit(num);
		while(num!=0) {
			int rem = num % 10;
			res = (int)Math.pow(rem, digit) + res;
			num = num / 10;
			digit--;
		}
		return res;
	}

	public static void main(String[] args) {
		int num = 135;
		int res = find_arm(num);
		if(res == num ) {
			System.out.println("its deserium");
		}
		else {
			System.out.println("its not");
		}

	}

}
