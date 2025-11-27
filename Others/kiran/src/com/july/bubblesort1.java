package com.july;
import java.util.*;
public class bubblesort1 {
	
	public static void b_sort(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {24,105,133,108,6,72,88,56};
		b_sort(arr);
	}

}
