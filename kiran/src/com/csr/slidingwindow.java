package com.csr;

public class slidingwindow {
	public static int maxsum(int[]arr,int k) {
		int c_sum=0;
		int max_sum=0;
		
		for (int i=0; i<k; i++) {
			c_sum=arr[i]+c_sum;
		}
		
		for(int i=k; i<arr.length; i++ ) {
			c_sum=c_sum-arr[i-k]+arr[i];
			max_sum=Math.max(max_sum,c_sum);
		}
		
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,9,31,-4,21,77};
		int k = 3;
		int res=maxsum(arr,k);
		System.out.println(res);
	}

}
