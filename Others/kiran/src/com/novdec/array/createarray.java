package com.novdec.array;
import java.util.Scanner;

public class createarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i < n; i++) {
			System.out.println("enter the value at index "+i);
			int val = sc.nextInt();
			arr[i]=val;
		}
		
		for (int i=0; i <arr.length;i++) {
			int val = arr[i];
			System.out.println(i+"====>"+val+" ");
		}
		
		sc.close();
	}

}
