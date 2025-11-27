package com.july24;

public class num4 {
	
	public static int c_digit(int num) {
		int digit = 0;
		while(num!=0) {
			num/=10;
			digit++;
		}
		return digit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 420;
		int res = c_digit(num);
		System.out.println(res);
		
		
	}

}
