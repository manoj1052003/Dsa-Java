package com.jan26;

public class class11num1 {
	
	public static int check_fact(int num) {
		int count = 0;
		for(int i =1 ; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int t_count = 0;
		float sum = 0;
		for(int k=1; k<=10000; k++) {
			int num = k;
			int count = check_fact(num);
			if(count == 2) { //count --> factors
				//System.out.println(num);
				sum+=num;
				t_count++;
			}
			if(t_count==50) {
				break;
			}
		}
		System.out.println(sum/50);
		
		
	}
}
