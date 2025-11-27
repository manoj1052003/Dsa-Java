package com.onlinejavapro;

public class class13 {
	
	public static int f_pow(int num, int digit) {
		int count = 0;
		int res = 1;
		while(count != digit) {  // 3!=3
			res = res * num;    // res = 3 * 3 * 3
			count++;
		}
		return res;
	}
	
	public static int f_digit(int num) {
		int count = 0;
		while(num!=0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public static int f_arm(int num) {
		int digit = f_digit(num);
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res = f_pow(rem, digit) + res;
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 152;
		int arm = f_arm(num);
		if(num == arm) {
			System.out.println("its armstrong");
		}
		else {
			System.out.println("its not");
		}
		
		
	}

}
