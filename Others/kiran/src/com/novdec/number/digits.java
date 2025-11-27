package com.novdec.number;

public class digits {
	
	public static int find_digit(int num) {
		int count=0;
		while(num>0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	public static int find_power(int n,int m) {
		
		int res =1;
		
		while(m>0) {
			res = res * n;
			m-=1;
		}
		return res;
	}
	
	public static int armstrong(int num) {
		int res = 0;
		int digit = find_digit(num);
		
		while(num>0) {
			int rem  = num % 10;
			res = find_power(rem,digit)+res;
			num = num / 10;
		}
		return res;
		
		
	}

	public static void main(String[] args) {
		int num = 153;
		int res = armstrong(num);
		if (res == num) {
			System.out.println("its armstrong");
		}
		else {
			System.out.println("its not");
		}
		
		
		

	}

}
