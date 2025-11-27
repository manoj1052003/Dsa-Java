package com.june;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" "+" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print("*"+" ");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1; i<rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" "+" ");
			}
			for(int j=1; j<=rows-i; j++) {
				System.out.print("*"+" ");
			}
			for(int j=1; j<=rows-1-i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
