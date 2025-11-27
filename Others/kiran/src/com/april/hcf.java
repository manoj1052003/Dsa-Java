package com.april;

public class hcf {
	
	public static int find_lcm(int a, int b) {
		int grt = (a>b)?a:b;
		int cm = 0;
		for (int i=grt; i<=(a*b); i++) {
			if(i%a==0 && i%b==0) {
				cm = i;
				break;
			}
		}
		return cm;
	}
	
	
	public static int find_hcf(int a, int b) {
		int smallest = 0;
		int cf = 0;
		smallest = (a<b)?a:b;
		for (int i=smallest; i>=1; i--) {
			if(a%i==0 && b%i==0) {
				cf = i;
				break;
			}
		}
		return cf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int Hcf = find_hcf(a,b);
		int Lcm = find_lcm(a,b);
		System.out.println("hcf of "+a+" and "+b+" is "+ Hcf);
		System.out.println("lcm of "+a+" and "+b+" is "+ Lcm);

	}

}
