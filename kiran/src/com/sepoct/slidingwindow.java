package com.sepoct;

public class slidingwindow {

	public static void main(String[] args) {
		int [] arr = {-12,-4,-6,-2,-7,-5};
		int max = arr[0] ;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum = sum + arr[j];
				max = Math.max(sum, max);
			}
		}
		System.out.println(max);
	}
}
