package com.july24;

public class num3 {
	
	public static int c_prime(int num) {
		int count = 0;
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int k =1;
		int count = 0;
		while(true) {
			if(c_prime(k)==2) {
				System.out.println(k);
				count++;
			}
			k++;
			if(count==n) {
				break;
			}
		}
		
		
	}

}
