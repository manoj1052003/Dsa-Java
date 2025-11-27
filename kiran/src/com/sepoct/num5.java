package com.sepoct;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 8;
		while(a!=0 && b!=0) {
			if(a>b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		if(a!=0) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}

}
