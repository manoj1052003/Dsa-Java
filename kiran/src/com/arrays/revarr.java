package com.arrays;
import java.util.Scanner;

public class revarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of array");
		int length = sc.nextInt();
		int [] arr = new int [length];
		System.out.println("enter all the elements");
		for (int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	}

}
