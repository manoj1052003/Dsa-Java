package com.arrays;

public class simplesort {
	
	static void bubble(int [] arr) {
		
		for (int j=0; j < arr.length-1; j++) {
			
			for (int i=0; i< arr.length-1; i++) {
				
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]= temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {20,21,3,7,34,56,8,24};
		bubble(arr);
		
		for (int i =0; i < arr.length; i++) {
			System.out.println(i+"----->"+arr[i]);
		}

	}

}
