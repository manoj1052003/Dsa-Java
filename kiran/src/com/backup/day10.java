package com.backup;

public class day10 {
	
	public static int count_digit(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
	
	public static int check_armstrong(int num) {
		int digit = count_digit(num);
		int res =0;
		while(num!=0) {
			int rem = num % 10;
			res =(int)Math.pow(rem,digit) + res;
			num = num / 10;
		}
		return res;
	}
	
	public static int check_perfect(int num) {
		int res = 0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				res = res + i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int res = check_perfect(num);
		if(num == res) {
			System.out.println("its perfect");
		}
		else {
			System.out.println("its not");
		}
		
		
	}

}
