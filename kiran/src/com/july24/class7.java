package com.july24;

public class class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
			int temp = sum;
			for(int j=1;j<=i; j++) {
				System.out.print(temp+" ");
				temp--;
			}
			System.out.println();
		}
	}

}
