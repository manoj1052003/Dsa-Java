package com.april;

public class studchocklet {
	public static int reverse(int num) {
		int res=0;
		while(num!=0)
		{ int rem=num%10;
		res=(res*10)+rem;
		num=num/10;
		}
		return res;
	}

	public static void main(String[] args) {
		int n=22;
		int rev=reverse(n);
		if(rev==n)
		{
			System.out.println(rev);
		}
	
}
}
