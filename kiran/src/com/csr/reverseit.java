package com.csr;

public class reverseit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12321;
		int res=0;
		int temp = num;
		while(num!=0) {
			int rem = num%10;
			res=res*10+rem;
			num = num / 10;
			System.out.println("num "+num);
		}
		System.out.println("num "+num);
		System.out.println("res "+res);
		if (temp==res) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not");
		}
	}

}
