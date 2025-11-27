package com.novdec;

public class revrese {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		
		int c = a;
			a = b;
			b = c;
		
			System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}
}

