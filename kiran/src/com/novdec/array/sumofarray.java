package com.novdec.array;

public class sumofarray {
	
	public static int [] sum(int[]arr1,int[]arr2) {
		int [] res = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			res[i]=arr1[i]+arr2[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {12,23,34,45,56};
		int [] arr2 = {76,65,53,43,32};
		int [] res = sum(arr1,arr2);
		for (int i=0; i<res.length; i++) {
			System.out.println(i+"===>"+res[i]);
		}
		
		
		
	}

}