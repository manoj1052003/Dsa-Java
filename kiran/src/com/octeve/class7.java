package com.octeve;

public class class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int k=1;
		int k1 = 65;
		int k2 = 97;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				if(k%2==0) {
					System.out.print((char)(k2)+" ");
				}
				else {
					System.out.print((char)(k1)+" ");
				}
				k++;
				k1++;
				k2++;
			}
			System.out.println();
		}
	}

}
