package com.june;

public class subarra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,-5,-1,6,-3};
		int largest = arr[0];
		for(int i=0;i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum+=arr[j];
				if(sum>largest) {
					largest = sum;
				}
			}
		}
		System.out.println(largest);
	}

}
