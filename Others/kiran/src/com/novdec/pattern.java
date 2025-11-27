package com.novdec;

public class pattern {

	public static void main(String[] args) {
		int i,j,k=1,sum=0;
		for(i=1;i<=4;i++)
		{
			sum=sum+i;
			k=sum;
			
		for(j=1;j<=i;j++)
		{
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
