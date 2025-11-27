package com.test;

public class testfeb {
	
	public static boolean count_digit(int num,int k) {
		int count = 0;
		while(num != 0) {
			num /= 10;
			count++;
		}
		if(count == k) {
			return true;
		}
		return false;
		
	}
	
	public static boolean add_digit(int num, int s) {
		int res = 0;
		while( num != 0) {
			int rem = num % 10;
			res = res + rem;
			num /= 10;
		}
		if(res == s) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		int k = 2;
//		int s = 9;
//		for(int i=1; ; i++) {
//			int num = i;
//			if(count_digit(num, k) && add_digit(num, s)) {
//				System.out.println(num);
//				break;
//			}
//		}
		
		int [] arr = {2,3,1,2,4,3};
		int k = 7;
		int max_len = 100;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum = 0;
				int len = 0;
				for(int n = i; n<=j; n++) {
					sum += arr[n];
					len++;
				}
				if(sum >= k) {
					if(len < max_len) {
						max_len = len;
					}
				}
			}
		}
		System.out.println(max_len);
		
		

	}

}
