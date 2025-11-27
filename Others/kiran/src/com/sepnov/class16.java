package com.sepnov;
import java.util.*;

public class class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {256,46,18,7,1,17};
		int ele = 420;
		int index = 3;
		int [] res = new int [arr.length-1];
		for(int i=0; i<index; i++) {
			res[i] = arr[i];
		}
	
		for(int i=index+1; i<arr.length; i++) {
			res[i-1] = arr[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
