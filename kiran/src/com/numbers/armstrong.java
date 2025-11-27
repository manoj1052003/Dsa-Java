package com.numbers;


public class armstrong {
	
	static int digit_of_num(int num) {
		
		int count = 0;
		
		while(num>0) {
			
			num = num / 10;
			
			count+=1;
		}
		
		return count;
	}
	
	static int power(int rem,int digit) {
		
		int power = digit;
		
		int res = 1;
		
		while(digit>0) {
			
			res = res * rem;
			digit-=1;
		}
		
		return res;
		
	}
	
	static int armstrong(int num) {	
		
		int digit = digit_of_num(num);
		
		int res = 0;
		
		while(num>0) {
			
			int rem = num % 10;
					
			res = (int)Math.pow(rem, digit) + res ;
			
			num = num /10;
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num =1; num <=10000; num++) {
		
			int ans = armstrong(num) ;
			
			if (ans == num) {
				System.out.println(ans+" ");
			}
			else {
				System.out.print(""+"");
			}
	
		}
		
	}

}
