package com.csr;

import java.util.Arrays;


public class mergerwo {
	
	public static int[] merge(int[] arr1,int[]arr2) {
		int[] res = new int[arr1.length+arr2.length];
		int i =0;
		int j = 0;
		int k= 0;
		while(i<arr1.length && j <arr2.length) {
			if(arr1[i]<arr2[j]) {
				res[k]=arr1[i];
				k++;
				i++;
			}
			else {
				res[k]=arr2[j];
				k++;
				j++;	
			}
		}	
			while(i<arr1.length) {
				res[k]=arr1[i];
				k++;
				i++;
			}
			while(j<arr2.length) {
				res[k]=arr2[j];
				k++;
				j++;
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {12,23,34,45,56,67,78};
		int[] arr2= {5,10,26,45,88};
		int [] res = merge(arr1,arr2);
		System.out.println(Arrays.toString(res));
	}

}
