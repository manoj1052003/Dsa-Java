package com.arrays;
import java.util.*;
public class merge_sort {
	
	static int[] divide(int [] arr) {
		if (arr.length <= 1)
			return arr;
		int length = arr.length;
		int mid = arr.length/2;
		int [] left = new int [mid];
		int [] right = new int [length - mid ];
		
		for(int i=0; i<mid; i++) {
			left[i]=arr[i];
		}
		
		for(int i=mid; i<arr.length; i++) {
			right[i-mid]=arr[i];
		}
		
		left = divide(left);
		right = divide(right);
		return merge_arrays(left,right,arr);
		}
		
	
	static int[] merge_arrays(int[]a,int[]b,int[]res) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j < b.length) {
			if (a[i]<b[j]) {
				res[k] = a[i];
				i+=1;
				k+=1;
			}
			else {
				res[k] = b[j];
				j+=1;
				k+=1;
				
			}
		}
		
		while(i < a.length) {
			res[k] = a[i];
			i+=1;
			k+=1;	
		}
		
		while(j < b.length) {
			res[k] = b[j];
			j+=1;
			k+=1;
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {45,7,1,33,17,18,29,14};
		
		int [] res = divide(arr1);
		
		System.out.println(Arrays.toString(res));

	}

}
