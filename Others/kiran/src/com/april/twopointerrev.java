package com.april;
import java.util.*;

public class twopointerrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-5,6,0,55,100,9,-12};
		System.out.println(Arrays.toString(arr));
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
