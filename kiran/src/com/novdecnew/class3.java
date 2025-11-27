package com.novdecnew;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 3 changing the print statemnt
		int rows = 6;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(rows+1-j+" ");
			}
			System.out.println();
		}
	}

}
