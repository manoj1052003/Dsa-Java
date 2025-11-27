package com.novdec;
import java.util.Scanner;

public class friday{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 14;
		int grt = 0;
		
		if (a>b) {
			grt = a;
		}
		else {
			grt = b;
		}
		
		for (int i = grt; i <= (a*b); i++) {
			
			if (i % a  ==0 && i % b == 0) {
				
				
				System.out.println(i);
				break;
				
			}
			
		}
		
		
	}

}
