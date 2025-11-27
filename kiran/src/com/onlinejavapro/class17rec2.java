package com.onlinejavapro;

public class class17rec2 {
	
	public static int rev_rec(int num, int res) {
		if(num == 0) {
			return res;
		}
		return rev_rec(num/10, (res*10) + (num% 10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int res = 0;
		int rev = rev_rec(num, res);
		System.out.println(rev);
	}

}
