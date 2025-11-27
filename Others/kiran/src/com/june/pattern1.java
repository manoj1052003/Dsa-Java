package com.june;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,4,9,-5,14,3,6,-5};
		int k = 3;
		int c_sum = 0;
		for(int i=0; i<k; i++) {
			c_sum += arr[i];
		}
		int max_sum = c_sum;
		for(int i=k; i<arr.length; i++) {
			c_sum=c_sum+arr[i]-arr[i-k];
			max_sum = Math.max(max_sum, c_sum);
		}
		System.out.println(max_sum);

	}

}
