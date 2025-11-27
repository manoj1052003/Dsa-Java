package com.august;

public class eleventhclas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 9;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=cols; j++) {
				if(i+j==6 || j-i==4) {
					System.out.print(i+"");
				}
				else {
					System.out.print(" "+"");
				}
			}
			System.out.println();
		}
		for(int i=rows-1; i>=1; i--) {
			for(int j=1; j<=cols; j++) {
				if(i+j==6 || j-i==4) {
					System.out.print(i+"");
				}
				else {
					System.out.print(" "+"");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
