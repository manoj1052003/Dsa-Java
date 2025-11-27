package com.grooom;

public class targetsumsubarray {
	
	public static void find(int [] arr, int tar, int size) {
		int max = 0;
		for(int i=0; i<=arr.length-size; i++) {
			int sum = 0;
			for(int j=i; j<i+size;j++) {
				sum+=arr[j];
			}
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-4,4,5,7,-2,-13,13};
		int tar = 9;
		int size = 2;
		find(arr,tar,size);
	}

}
