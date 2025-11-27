package com.csr;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b = 2;
		int great;
		if(a>b) {
			great=a;
		}
		else {
			great=b;
		}
		for (int i=great; i<=(a*b);i++) {
			if (i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
