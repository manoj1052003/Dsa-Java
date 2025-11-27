package com.june;

public class num12 {
	
	public static int count_digit(int num) {
		int digit = 0;
		while(num!=0) {
			num = num / 10;
			digit++;
		}
		return digit;
	}
	
	public static int f_Arm(int num) {
		int digit = count_digit(num);
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res = (int) Math.pow(rem, digit) + res;
			num = num / 10;
		}
		return res;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25;
		for(int i=1; i<=(int)Math.sqrt(num); i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		for(int i=(int)Math.sqrt(num); i>=1; i--) {
			if(num%i==0 && num/i!=i) {
					System.out.println(num/i);
			}
		}
		
	}

}
