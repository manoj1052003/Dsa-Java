package com.novdecnew;

public class class12 {
	
	public static int print_fact(int num) {
		int sum = 0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29;
		int sum = print_fact(num);
		if(sum == num) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not");
		}
	}

}
