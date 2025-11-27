package com.sepoct;

public class thirdclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int k = 1;
		int A = 65;
		int B = 97;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(k%2==0) {
					System.out.print((char)B+" ");
				}
				else {
					System.out.print((char)A+" ");
				}
				A++;
				B++;
				k++;
			}
			System.out.println();
		}
	}
}
