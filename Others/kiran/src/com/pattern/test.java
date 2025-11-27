package com.pattern;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5 ;
		int sum = 0;
		for(int i=1; i<=rows; i++) {
			sum = sum + i;
			int k = sum;
			for (int j=0; j<i; j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		

	}

}
