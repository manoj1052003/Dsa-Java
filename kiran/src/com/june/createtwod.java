package com.june;
import java.util.*;
public class createtwod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 5;
		int [] [] arr = new int[rows][cols];
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int k = 11;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = k++;
				
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
