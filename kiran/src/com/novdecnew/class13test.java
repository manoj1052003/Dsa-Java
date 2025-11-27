package com.novdecnew;

public class class13test {
	public static void main(String[] args) {
		int rows = 5;
		int k = 65;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1 || i==rows ||i==j) {
					System.out.print((char)k+" ");
					k++;
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	}
}
