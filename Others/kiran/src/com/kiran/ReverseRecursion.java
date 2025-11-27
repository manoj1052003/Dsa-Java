package com.kiran;

import java.util.Scanner;

public class ReverseRecursion {
	
	static int reverse(int num, int res) {
		if (num<=0) {
			return res;
		}
		return reverse(num/10,(res*10)+num%10);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numeber");
		int num = sc.nextInt();
		int res = 0;
		int ans = reverse(num,res);
		if (ans == num) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("its not");
		}

	}

}
