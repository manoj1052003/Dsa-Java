package com.novdec.array;
import java.util.*;

public class arraycreate {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(i+"---->"+arr[i]);
		}
		
		
		
	}

}
