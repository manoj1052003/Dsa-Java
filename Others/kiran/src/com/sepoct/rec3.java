package com.sepoct;

public class rec3 {
	
	public static int count_digit(int num, int count) {
		if(num==0) {
			return count;
		}
		return count_digit(num/10, ++count);
		
	}
	
	public static int armstrong(int num, int digit,int res) {
		if(num==0) {
			return res;
		}
		return armstrong(num/10, digit, res + (int)Math.pow(num%10, digit));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 152;
		int count = 0;
		int digit  = count_digit(num,count);
		System.out.println(armstrong(num,digit,0));
		
		

	}

}
