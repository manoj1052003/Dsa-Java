package com.numbers;

public class forthclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 6;
		for(int i = Math.max(a, b); i<=(a*b) ; i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
