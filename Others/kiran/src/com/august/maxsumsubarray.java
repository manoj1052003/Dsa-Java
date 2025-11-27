package com.august;

public class maxsumsubarray {
	
	public static int max_sum_subarray(int [] arr,int k) {
		int sum  = 0;
		for(int i=0; i<k ;i++) {
			sum+=arr[i];
		}
		int c_sum = sum;
		for(int i=0; i<=arr.length-k; i++) {
			int res = 0;
			for(int j =i; j<i+k;j++) {
				res = res + arr[j];
				}
			if(res>c_sum) {
				c_sum = res;
			}
		}
		return c_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-9,8,-4,3,-2,7,5,-4};
		int k = 3;
		int max = max_sum_subarray(arr,k);
		System.out.println(max);
	}

}
