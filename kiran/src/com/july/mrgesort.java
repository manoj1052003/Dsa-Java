package com.july;
import java.util.*;
public class mrgesort {
	
	public static int [] divide(int [] arr) {
		if(arr.length<=1) {
			return arr;
		}
		int mid = arr.length/2;
		int [] left = new int[mid];
		int [] right = new int[arr.length-mid];
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		for(int i=mid; i<arr.length; i++) {
			right[i-mid] = arr[i];
		}
		left = divide(left);
		right = divide(right);
		
		return merge(left,right,arr);
	} 

	public static int[] merge(int [] arr1, int [] arr2,int [] res) {
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				res[k]= arr1[i];
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
			res[k]= arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			res[k]= arr2[j];
			k++;
			j++;
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21,10,6,62,32,42,29,7};
		int [] res = divide(arr);
		System.out.println(Arrays.toString(res));
	}

}
