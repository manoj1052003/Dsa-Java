package com.june;
import java.util.*;
public class sqrrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 9;
		int cols = 9;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=cols; j++) {
				if((i==1)||(i==rows)||(j==1)||(j==cols)||(i==(rows+1)/2)||(j==(cols+1)/2) ||(i==j) ||(i+j==rows+1)) {
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
