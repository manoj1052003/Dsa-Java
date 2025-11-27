package com.numbers;

public class fibo {

	static void fibo(int n) {
		
		int a=0;
		int b=1;
		int res = 0;
		
		for (int i =0; i < n; i++) {
			System.out.println(a);
			res=a+b;
			a=b;
			b=res;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =8;
		fibo(n);
		
		
	}

}
