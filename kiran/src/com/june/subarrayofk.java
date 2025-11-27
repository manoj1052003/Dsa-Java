package com.june;

public class subarrayofk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-7,-10,18,15,1,5,-3,-2};
		int k = 3;
		int c_sum = 0;
		for(int i=0; i<k;i++) {
			c_sum+=arr[i];
		}
		int max_sum = c_sum;
		
		for(int i=0; i<arr.length-k; i++) {
			c_sum = c_sum - arr[i] + arr[i+k];
			if(c_sum>max_sum) {
				max_sum = c_sum;
			}
		}
		System.out.println(max_sum);
	}

}
