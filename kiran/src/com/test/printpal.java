package com.test;

public class printpal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 1000; i++) {
			
			int num = i;
			int temp = num;
			int res = 0;
			 while(num>0) {
				 int rem = num % 10;
				 res =(res * 10)+rem;
				 num = num / 10;
				 
			 }
			 if (res == temp) {
				 System.out.println(temp);
			 }
		}

	}

}
