package com.sepoct;

public class numpattern {
	
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
		 int num = 6;
		 int sum = 0;
		 for(int i=1; i<num; i++) {
			 if(num%i==0) {
				 //System.out.println(i);
				 sum=sum+i;
			 }
		 }
		 if(sum==num) {
			 System.out.println("perfect");
		 }
		 else {
			 System.out.println("not");
		 }
		
	}

}
