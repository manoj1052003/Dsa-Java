package com.april;

public class chockletstud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 7;
		int sum = 0;
		
		for (int i=1; i<=rows; i++) {
			sum=sum+i;
			int temp = sum;
			for (int j=1; j<=i; j++) {
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println();
		}
	}

}
