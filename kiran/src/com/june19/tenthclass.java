package com.june19;

public class tenthclass {
	
	public static int c_perfect(int num) {
		int sum = 0;
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=1000000; i++) {
			int num = i;
			int res  = c_perfect(num);
			if(num==res) {
				System.out.println(i);
			}
			
		}
		
	}

}
