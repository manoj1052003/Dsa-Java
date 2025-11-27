package com.sepoct;

public class num2 {
	
	public static int reverse(int num) {
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=1; k<=1000; k++) {
			int num = k;
			int rev = reverse(num);
			if(rev==num) {
				System.out.println(num);
			}
		}
		
	}

}
