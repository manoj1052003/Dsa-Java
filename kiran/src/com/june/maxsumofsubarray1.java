package com.june;

public class maxsumofsubarray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-8,7,9,2,-4,1,4};
		int res = 0;
		int k = 3;
		for(int i=0; i<k; i++) {
			res+=arr[i];
		}
		int max = res;
		for(int i=0; i<arr.length-k+1; i++) {
			int sum = 0;
			for(int j=i; j<i+k; j++) {
				sum+=arr[j];
			}
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
