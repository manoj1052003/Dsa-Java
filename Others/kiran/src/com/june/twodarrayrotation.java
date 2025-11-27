package com.june;
import java.util.*;
public class twodarrayrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int cols = 5;
		int [][] arr = new int[rows][cols];
		for (int i=0; i<rows;i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int low = 0;
		int high = arr.length-1;
		int k =11;
		for(int i=0; i<arr.length; i++) {
			for(int j=low; j<=high;j++) {
				arr[low][j] = k;
				k++;
			}
			for(int j=low+1; j<=high; j++) {
				arr[j][high] = k;
				k++;
			}
			for(int j=high-1; j>=low; j--) {
				arr[high][j] = k;
				k++;
			}
			for(int j=high-1;j>low; j--) {
				arr[j][low]=k;
				k++;
			}
			low++;
			high--;
		}
		for (int i=0; i<rows;i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
		
		
	// rotate the array
	low = 0;
	high = arr.length-1;
	
	for(int i=0; i< arr.length/2; i++) {
		int temp = 0;
		int temp1 = 0;
		temp = arr[low][high];
		for(int j=high-1; j>=0; j--) {
			arr[low][j+1] = arr[low][j];
		}
		temp1 = arr[high][high];
		for(int j=high-1; j>0; j--) {
			arr[j+1][high] = arr[j][high];
			
		}
		arr[low+1][high] = temp;
		temp = arr[high][low];
		for(int j=low+1;j<=high; j++) {
			
			arr[high][j-1] = arr[high][j];
			
		}
		arr[high][high-1] = temp1;
		for(int j=low+1; j<high; j++) {
			arr[j-1][low] = arr[j][low];
			
		}
		arr[high-1][low] = temp;
		low++;
		high--;
		
	}
	for (int i=0; i<rows;i++) {
		for(int j=0; j<cols; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(Arrays.deepToString(arr));
	}

}
