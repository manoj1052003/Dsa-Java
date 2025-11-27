package com.sepoct;

public class num3 {
	
	public static int count_digit(int num) {
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		return count;
	}
	
	public static int check_arm(int num) {
		int digit = count_digit(num);
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res = res + (int)Math.pow(rem, digit);
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=1; k<=10000; k++) {
			int num = k;
			int res = check_arm(num);
			if(res == num) {
				System.out.println(num);
			}
		}
		
	}

}
