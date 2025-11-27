package com.sepnov;

public class class15 {
	
	public static void lcm(int a, int b) {
		int grtst = (a>b)?a:b;
		for(int i=grtst; i<=a*b; i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// O(max(a,b))
		int a = 25;  
		int b = 15;  
		lcm(a,b);
		
		
	}
}