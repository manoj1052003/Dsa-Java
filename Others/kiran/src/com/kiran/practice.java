package com.kiran;
import java.util.*;
public class practice {
	
	public static void main(String[] args) {
		
		int rows =7;
		
		int k = 1;
		
		for (int i = 1; i<=rows; i++) {
			
			for (int j=1; j<=i; j++) {
				
				if (k==1) {
					
					System.out.print(k+" ");
					k--;
				}
				
				else {
					
					System.out.print(k+" ");
					k++;
				}	
				
			}
			
			System.out.println();
		}
	}

}
