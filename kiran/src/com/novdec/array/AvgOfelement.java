package com.novdec.array;

public class AvgOfelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int length = arr.length;
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
     float Avg =sum/length;
     System.out.println("Average of elements:"+Avg);
	}
}
