package com.onlinejavapro;

import java.util.Arrays;

public class class23array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2d array
		int rows = 3; // i
		int cols = 4; //j
		int k = 11;
		//int [5]; ---> 1d
		int [][] arr = new int [rows][cols]; 
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		// printing 2d array
		System.out.println(Arrays.deepToString(arr));
		
		//matrix 
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
