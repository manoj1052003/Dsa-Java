package com.sepoct;
import java.util.*;
public class array5 {
	
	public static void merge_arrays(int [] arr1, int [] arr2, int [] res) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			res[k] = arr2[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {16,17,26,32};
		int [] arr2 = {10,15,60,70,82,90};
		int [] res = new int [arr1.length+arr2.length];
		merge_arrays(arr1,arr2,res);
		System.out.println(Arrays.toString(res));
		
		
		
		

	}

}
