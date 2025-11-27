package com.july;

public class hearttttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;
		int cols = 7;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if((i==1 && j%3==0) ||(i==0 && j%3!=0) || (i+j==8)||(i-j==2)) {
					System.out.print("*"+" ");
				}
				else if(i==2 && j==2) {
					System.out.print("R"+" ");
				}
				else if(i==2 && j==3) {
					System.out.print("C"+" ");
				}
				else if(i==2 && j==4) {
					System.out.print("B"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		for(int i=rows-1; i>=0; i--) {
			for(int j=0; j<cols; j++) {
				if((i==1 && j%3==0) ||(i==0 && j%3!=0) || (i+j==8)||(i-j==2)) {
					System.out.print("*"+" ");
				}
				else if(i==2 && j==2) {
					System.out.print("C"+" ");
				}
				else if(i==2 && j==3) {
					System.out.print("S"+" ");
				}
				else if(i==2 && j==4) {
					System.out.print("K"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}

}
