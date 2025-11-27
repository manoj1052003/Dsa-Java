package com.onlinejavapro;

public class class16rec1 {
	
	public static void print_num(int num, int res) {
		if(num == 0 ) {
			System.out.println(res);
			return;
		}
		print_num(num-1, res*num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int res = 1;
		print_num(num, res);
	}

}
