package com.novdec;
import java.util.Scanner;

public class countdigit {
	
	static int find_digit(int num) {
		int count = 0;
		while(num>0) {
			num=num/10;
			count+=1;
		}
		return count;	
	}

	public static void main(String[] args) {
		int num = 153;
		int res = find_digit(num);
		System.out.println(res);
		System.out.println(num);
		
		
		
		
			
			
		
	}
}
		
