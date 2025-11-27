package com.june;

public class num1 {
	public static int  print_num(int num) {
		if(num == 0) {
			System.out.println(num);
			return num;
		}
		System.out.println(num);
		return print_num(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int res = print_num(num);
		System.out.println(res);
	}

}
