package com.strings;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter an string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ns = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			ns = c + ns;
		}
		
		System.out.println(ns);
		

	}
	


}
