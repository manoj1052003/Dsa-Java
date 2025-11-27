package com.zoho;

public class pat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;
		for(int i=1; i<=rows; i++) {
			int k = i;
			for(int j=1; j<=rows; j++) {
				int l = k%rows;
				if(l==0) {
					System.out.print(rows+" ");
				}
				else {
					System.out.print(l+" ");
				}
				k++;
			}
			System.out.println();
		}
	}

}
