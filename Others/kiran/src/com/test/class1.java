package com.test;

public class class1 {
	
	public static int count_fact(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1 = 0;
		for(int i=1; ; i++) {
			int n = i;
			int count = count_fact(n);
			// count is to count the factors
			//count1 is to count the prime numbers
			if(count == 2) {
				System.out.println(n);
				count1++;
			}
			if(count1 == 50) {
				break;
			}
		}
		
		
		
	}

}
