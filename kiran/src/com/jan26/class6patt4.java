package com.jan26;

public class class6patt4 {
	
	public static int add_digit(int num) {
		int res = 0;
		while(num != 0) {
			int rem = num % 10;
			res = rem + res;
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 99;
		int res = num+1;
		while(add_digit(num)*2 != add_digit(res)) {
			res++;
		}
		System.out.println(res);
		
			
	}

}
