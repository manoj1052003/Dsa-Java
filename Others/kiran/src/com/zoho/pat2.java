package com.zoho;

public class pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		for(int i=1; i<(2*rows); i++) {
			for(int j=1; j<(2*rows); j++) {
				if(i<=rows && j<=rows) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	}
}
