package com.onlinejavapro;

public class class14 {
	
	public static void chech_spy(int num) {
		int sum = 0;
		int pro = 1;
		
		while(num!=0) {
			int rem = num % 10;
			sum = sum + rem;
			pro = pro * rem;
			num = num / 10;
		}
		if(sum==pro) {
			System.out.println("spy");
		}
		else {
			System.out.println("its not");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1124;
		chech_spy(num);
		
	}

}
