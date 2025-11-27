package com.strings;
import java.util.*;
public class sat12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="india is my country";
		String [] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
