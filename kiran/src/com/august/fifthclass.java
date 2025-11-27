package com.august;

public class fifthclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int k =1;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" "+" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");

			}
			System.out.println();
		}
	}

}
