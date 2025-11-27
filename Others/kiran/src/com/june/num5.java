package com.june;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int sum =0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println("its perfect");
		}
		else {
			System.out.println("not perfect");
		}
	}

}
