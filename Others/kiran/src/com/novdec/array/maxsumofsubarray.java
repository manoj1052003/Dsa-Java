package com.novdec.array;

public class maxsumofsubarray {
	
	public static int subarr(int [] arr,int n) {
		int max_sum=arr[0];
		
		for (int i=0; i<=arr.length-n;i++) {
			int c_sum=0;
			for (int j=i;j<i+n;j++) {
				c_sum=c_sum+arr[j];
			}
			max_sum=Math.max(max_sum, c_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {24,8,-9,42,6,-14,32,17};
		int n = 3;
		int max = subarr(arr,n);
		System.out.println(max);
	}

}
