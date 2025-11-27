package com.sepoct;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,23,34,45,56,67,78};
		float sum = 0;  
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2!=0) {
				sum = sum + arr[i];
				count++;
			}
			
		}
		System.out.println(sum/count);
	}

}
