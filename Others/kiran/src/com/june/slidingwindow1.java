package com.june;

public class slidingwindow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,1,2,-7,8,-9,4};
		int res = 0;
		int k = 3;
		for(int i=0; i<k; i++) {
			res+=arr[i];
		}
		int max = res;
		int sum = res;
		for(int i=0; i<arr.length-k; i++) {
			sum = sum - arr[i] + arr[i+k];
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
