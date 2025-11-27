package com.arrays;

import java.util.Scanner;

public class thirdarray {
	
static int [] delete(int arr[],int in) {
		
		if (in >arr.length || in < 0 ) {
			System.out.println("invalid index");
			return arr;
		}
		
		else {
			
			int na[]= new int[arr.length-1];
			for (int i = 0; i < in; i++) {
				
				na[i] = arr[i];
			}
			
			
			for (int i = in+1; i < arr.length; i++) {
				
				na[i-1] = arr[i];
			}
			
			return na;
			
		}
		
	}
	
	
	
	public static void main (String [ ] args)
	{
	Scanner sc= new Scanner (System.in);
	System.out.println ("enter the size");
	int length= sc.nextInt ();
	int  [ ] arr =new int [length];
	System.out.println ("enter the "+length+" elements");
	for (int i = 0; i < arr.length; i++) {
	arr[i] =sc.nextInt ();
	}
	for (int i = 0; i < arr.length; i++)
	{
	System.out.println ("arr ["+i+"] ---->"+arr[i]);
	}
	
	System.out.println("enter the specific index");
	int in = sc.nextInt();
	
	int[] na =  delete(arr,in);
	for (int i = 0; i < na.length; i++) {
		System.out.println(i+"------------>"+na[i]);
	}
	}

}
