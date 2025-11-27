package com.basicspro;

import java.util.ArrayList;

public class firdtclass {
	
	public static boolean check_palindrome(int num) {
		int res = 0;
		int temp = num;
		while(num!=0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		if(temp==res) {
			return true;
		}
		return false;
	}
	
	public static int rev(int num) {
		int res = 0;
		int temp = num;
		while(num!=0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return (res + temp);
	}

	public static void main(String[] args) {
		int num = 196;
		int res = num;
		boolean b = false; 
		int count = 0;
		int fifth = 0;
		while(count < 10) {
			count++;
			res = rev(res);
			//System.out.println(res);
			b = check_palindrome(res);
			if(b==true) {
				System.out.println("iterations as : "+ count);
				break;
			}
			if(count == 4) {
				fifth = rev(res) ;
			}
		}
		if(b==false) {
			System.out.println(fifth);
		}
	}
}
	
