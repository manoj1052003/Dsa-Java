package com.onlinejavapro;

import java.util.Arrays;

public class class22array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {20,60,45,12,-55,-3,10};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
