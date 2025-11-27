package com.april;
import java.util.*;

public class firstarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 4;
		int ele = 45;
		int [] arr = new  int[5];
		int k = 10;
		System.out.println(Arrays.toString(arr));
		for (int i=0; i<arr.length; i++) {
			arr[i]=k;
			k+=10;
		}
		System.out.println(Arrays.toString(arr));
		int [] res = new int [arr.length+1];
		System.out.println(Arrays.toString(res));
		for(int j = 0; j < index; j++) {
			res[j] = arr[j];
		}
		
		System.out.println(Arrays.toString(res));
		res[index]=ele;
		System.out.println(Arrays.toString(res));
		for(int j=index; j<arr.length; j++) {
			res[j+1] = arr[j];
		}
		System.out.println(Arrays.toString(res));
	}

}
