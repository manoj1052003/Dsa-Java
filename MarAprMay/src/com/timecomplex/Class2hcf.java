package com.timecomplex;

public class Class2hcf {

	public static void main(String[] args) {
		int a = 12;
		int b = 24;
		while (a != 0 && b!=0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if(a != 0) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}

	}

}
