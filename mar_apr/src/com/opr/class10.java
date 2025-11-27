package com.opr;

public class class10 {
	
	public static int check_per(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int val = 0;
		for(int k=1; k<=10000; k++) {
			int num = k;
			int sum = check_per(num);
			//System.out.println(sum);
			if(sum == 2) {
				System.out.println(num);
				val++;
				if(val == 50) {
					break;
				}
			}
		}

	}

}
