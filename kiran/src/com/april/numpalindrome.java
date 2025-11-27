package com.april;

public class numpalindrome {
	
	public static int check_palindrome(int num) {
		int res = 0;
		while(num>0) {
			int rem = num % 10;
			res = (res*10)+rem;
			num/=10;		
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 7;
		int k = 1;
		for(int i=1; i<=rows; i++) {
			for (int j=1;j<=i; j++) {
				while(true) {
					if(check_palindrome(k)==k) {
						System.out.print(k+" ");
						k++;
						break;
					}
					else {
						k++;
					}
				}	
			}
			System.out.println();
		}

	}

}
