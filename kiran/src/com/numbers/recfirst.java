package com.numbers;

public class recfirst {
	
	static int palindrome(int num, int res) {
		
		if (num ==0) {
			return res;
		}
		return palindrome (num/10,(res*10)+num%10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12321;
		int res = 0;
		int ans = palindrome(num, res);
		if (num == ans) {
			System.out.println("its palindrome");	
		}
		else {
			System.out.println("its not");
		}
	}

}
