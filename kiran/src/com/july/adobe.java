package com.july;
import java.util.*;
public class adobe {
	
	public static void move_zeros(int [] arr) {
		if(arr.length<=1) {
			return;
		}
		int z = 0;
		int nz = 0;
		while(nz<arr.length) {
			if(arr[nz]==0) {
				nz++;
			}
			else {
				int temp = arr[z];
				arr[z] = arr[nz];
				arr[nz] = temp;
				z++;
				nz++;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,0,0,56,89,45,56,0};
		System.out.println(Arrays.toString(arr));
		move_zeros(arr);
		

	}

}
