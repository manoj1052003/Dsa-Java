package com.novdec.array;
import java.util.*;
public class twodarrcreate {
	
	public static void search(int [][] arr,int rows,int col) {
		int key=10;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<col; j++) {
				if(arr[i][j]==key) {
				System.out.println("row "+i);
				System.out.println("col "+j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		int col = 4;
		int [] [] arr = new int [rows][col];
		System.out.println(Arrays.deepToString(arr));
		int k=1;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<col; j++) {
				arr[i][j]=k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		search(arr,rows,col);
	}

}
