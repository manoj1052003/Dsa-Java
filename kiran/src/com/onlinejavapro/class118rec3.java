package com.onlinejavapro;

public class class118rec3 {
	
	public static int rec_digit(int num, int count) {
		if(num == 0) {
			return count;
		}
		return rec_digit(num/10,count+=1);
	}
	
	public static int arm(int num,int digit, int res) {
		if(num==0) {
			return res;
		}
		return arm(num/10,digit,(int)Math.pow((num%10), digit)+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int count = 0;
		int digit = rec_digit(num,count);
		//System.out.println(digit);
		int res = 0;
		int ans = arm(num,digit,res);
		//System.out.println(ans);
		if(num==ans) {
			System.out.println("its amstrong");
		}
		else {
			System.out.println("its not");
		}
		
	}

}
