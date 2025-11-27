package com.backup;
import java.util.*;
public class day20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pentagonspace";
		int [] arr = new int [130];
		for(int i =0; i<s.length();i++) {
			char c = s.charAt(i);
			arr[c]+=1;
			}
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>=1) {
				System.out.println((char)(i)+"  "+arr[i]);
			}
		}
		
	}

}
