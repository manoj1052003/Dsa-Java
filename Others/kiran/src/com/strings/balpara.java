package com.strings;
import java.util.*;

public class balpara {
	public static void print_par(char [] arr,int n,int i,int o,int c) {
		if(i==arr.length) {
			System.out.println(Arrays.toString(arr));
		}
		if(o<n) {
			arr[i]='(';
			print_par(arr,n,i+1,o+1,c);
		}
		if(c<o) {
			arr[i]=')';
			print_par(arr,n,i+1,o,c+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		char [] arr = new char [n*2];
		print_par(arr,n,0,0,0);

	}

}
