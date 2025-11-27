package com.novdec;

public class recursion {
	public static void print_num(int num) {
		if (num>10) {
			return;
		}
		print_num(num-1);
		System.out.println(num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		print_num(num);
		

	}

}
