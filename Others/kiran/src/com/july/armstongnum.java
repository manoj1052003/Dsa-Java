package com.july;

public class armstongnum {
	
	public static int c_digit(int num) {
		int digit = 0;
		while(num!=0) {
			num = num / 10;
			digit ++;
		}
		return digit;
	}
	
	public static int f_arm(int num) {
		int res = 0;
		int digit = c_digit(num);
		while(num!=0) {
			int rem = num % 10;
			res = (int) Math.pow(rem,digit)+res;
			num = num / 10;
		}
		return res;
	}
	
	public static int find_hcf(int a,int b) {
		int smlt = (a<b)?a:b;
		int cf = 0;
		for(int i=1; i<=smlt; i++) {
			if(a%i==0&& b%i==0) {
				cf=i;
			}
		}
		return cf;
	}
	
	
	public static int lame_hcf(int a,int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 24;
		int hcf = lame_hcf(a,b);
		System.out.println(hcf);
		
		
	}

}
