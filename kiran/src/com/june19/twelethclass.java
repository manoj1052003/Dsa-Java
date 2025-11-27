package com.june19;

public class twelethclass {
	
	public static int lcm(int a, int b) {
		int max = (a>b)?a:b;
		int cm = 1;
		for(int i=max; i<=(a*b); i++) {
			if(i%a==0 && i%b==0) {
				cm = i;
				break;
			}
		}
		return cm;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int res = lcm(a,b);
		System.out.println(res);
		

	}

}
