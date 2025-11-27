package com.csr;

public class heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int k=97;
		int ex =1;
		for (int i=1; i<=rows;i++) {
			for (int j=0;j<i;j++) {
				if (ex%2==1) {
					char c = (char)k;
					System.out.print(c+" ");
					k++;
					ex++;
				}
				else {
					char c = (char)(k-32);
					System.out.print(c+" ");
					k++;
					ex++;
				}
				
			}
			System.out.println();
		}
	}

}
