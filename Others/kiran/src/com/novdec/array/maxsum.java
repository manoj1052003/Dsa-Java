package com.novdec.array;

public class maxsum {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,8,7,3,2,9,6,5};
		int k = 3;
		int max_sum = 0;
		for (int i =0; i<=arr.length-k; i++) {
			int sum = 0;
			for (int j=i; j<i+k;j++) {
				sum = sum + arr[j];
			max_sum =Math.max(sum,max_sum);	
			}
		}
		System.out.println(max_sum);
	}

}
