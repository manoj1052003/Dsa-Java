package com.arrays;

public class contigioussum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]={21,12,15,32,16,17,22};
		
		int sum = ar[0]+ar[1];
		
		int index = 0;
		
		
		for (int i = 0; i<ar.length-1; i++) {
			
			if (ar[i]+ar[i+1] > sum) {
				
				sum = ar[i]+ar[i+1];
				
				index = i;
			}
		}
		
		System.out.println(sum);
		System.out.println(ar[index]);
		System.out.println(ar[index+1]);
		


	}

}
