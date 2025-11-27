package com.pattern;

import java.util.Scanner;

public class toughpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int k = 65;
		int count = 0;
		for (int i=1; i<=rows; i++)
		{	
			for (int j=1; j<=i; j++)
			{
				if(count%2==0) {
					System.out.print((char)(k+32)+" ");
				}
				else {
					System.out.print((char)k+" ");
				}
				count++;
				k++;
			}
			System.out.println();
		}

	}

}
