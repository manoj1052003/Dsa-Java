package com.sepoct;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60,70,80};
		int ele = 45;
		int ind = 4;
		int [] res = new int [arr.length+1];
		for(int i=0; i<ind; i++) {
			res[i] = arr[i];
		}
		res[ind] = ele;
		for(int i=ind; i<=arr.length-1; i++) {
			res[i+1] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}
	

}
