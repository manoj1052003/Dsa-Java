package com.novdec.number;

public class factorial {
	
	public static int find_fact(int num) {
		if(num<=1) {
			return 1;
		}
		return (num * find_fact(num-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int res = find_fact(num);
		System.out.println(res);
	}

}
