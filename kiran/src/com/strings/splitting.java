package com.strings;
import java.util.*;

public class splitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;
		int cols = 7;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if(i==2 && j==2) {
					System.out.print("R ");
				}
				else if(i==2 && j==3) {
					System.out.print("A ");
				}
				else if(i==2 && j==4) {
					System.out.print("M ");
				}
				else if((i==1 && j%3==0) || (i==0 && j%3!=0) || (i-j==2) || (i+j==8)) {
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
