package com.pattern;

import java.util.Scanner;


public class thirdcls {
	
	public static void main(String[] args) {
		
		int rows = 7;
		int sum = 0;
		
		for (int i=1; i<=rows; i++) {
			 sum = sum + i;
			 int k = sum;
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(k+" ");
				k = k - 1;
			}
			System.out.println();
		
		}
		
		
	}

}
