package com.numbers;

public class class2 {
	
	int count_fact(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int c_prime = 0;
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			int num = i;
			class2 c = new class2();
			int fact = c.count_fact(num);
			if(fact == 2) {
				sum = sum + num;
				c_prime++;
				if(c_prime == 100) {
					break;
				}
			}
		}
		System.out.println(sum);
		
	}

}
