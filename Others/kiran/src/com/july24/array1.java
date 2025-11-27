package com.july24;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the length of array");
		int num = sc.nextInt();
		int [] arr = new int[num];
		for(int i=0; i<num;i++) {
			System.out.println("enter values");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
