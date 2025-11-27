package com.octeve;

public class class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		for(int i=1; i<=rows; i++) {
			for(int j=rows+1-i;j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
