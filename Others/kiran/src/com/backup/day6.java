package com.backup;

public class day6 {
	public static int print_num(int num) {
		
		if(num==0) {
			return 0;
		}
		
		System.out.println(num);
		print_num(num-1);
		return num;
	}

	public static void main(String[] args) {
		
		int num = 5;
		int res = print_num(num);
		System.out.println(res);
	}

}
