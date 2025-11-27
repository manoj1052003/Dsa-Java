package com.sepnov;

public class class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = (rows * 2)-1;
		for(int i=1; i<=rows;i++) {
			for(int j=1; j<=cols; j++) {
				if((i==rows && j%2==1 )|| i+j==6 || j-i==4){
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
