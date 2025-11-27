package com.novdec.array;

public class findmax {
	
	public static int find_max(int[] arr) {
		int max = arr[0];
		for(int i =0; i <arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;	
	}
	
	public static int find_min(int[] arr) {
		int min = arr[0];
		for(int i =0; i <arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		return min;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20,34,12,26,75,39,71};
		int max_num = find_max(arr);
		int min_num = find_min(arr);
		System.out.println(max_num);
		System.out.println(min_num);
		
		

	}

}
