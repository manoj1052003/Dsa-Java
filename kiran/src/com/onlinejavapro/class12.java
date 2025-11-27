package com.onlinejavapro;

public class class12 {
	
	public static int find_fact(int num) {
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10000; i++) {
			int num = i;
			int res = find_fact(num);
			if(num == res) {
				System.out.println(num);
			}
		}
		
		
		
	}

}
