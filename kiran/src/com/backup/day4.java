package com.backup;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 9;
		for(int i=1; i<=rows; i++) {
			int k = i;
			for(int j=1; j<=rows; j++) {
				if(i==rows/2+1|| j==rows/2+1||i==1||i==rows||j==1||j==rows||i==j||i+j==rows+1) {
					System.out.print("*"+" ");
					k++;
				}
				else {
					System.out.print(" "+" ");
					k++;
				}
			}
			System.out.println();
		}
	}

}
