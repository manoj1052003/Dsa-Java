package com.sepoct;

public class rec2 {
	
	public static int reverse(int num, int res) {
		if(num==0) {
			return res;
		}
		return reverse(num/10,(res*10)+(num%10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int res = 0;          
		System.out.println(reverse(num,res));
	}

}
