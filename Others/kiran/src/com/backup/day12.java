package com.backup;
import java.util.*;

public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to delete an element from array
		int [] arr = {12,23,34,45,56,67,78,89};
		int index = 4;
		System.out.println(Arrays.toString(arr));
		int [] res = new int [arr.length - 1];
		for(int i=0; i<index; i++) {
			res[i]=arr[i];
		}
		for(int i=index+1 ; i<arr.length; i++) {
			res[i-1]= arr[i];
		}
		System.out.println("after dlting");
		System.out.println(Arrays.toString(res));
	}

}
