package com.pro;

public class Day1 {
	
	public static int count_fact(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num % i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int t_c = 0;
		for(int k=1; ; k++) {
			int num = k;
			int count = count_fact(num);
			if(count == 2) {
				System.out.println(num);
				t_c++;
			}
			if(t_c == 100) {
				break;
			}
		}
		

	}

}
