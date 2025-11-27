package com.july;

public class firstfiftpri {
	
	public static int rev(int num) {
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return res;
	}
	
	public static int digit_sum(int num) {
		int sum = 0;
		while(num!=0) {
			int rem = num % 10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}
	
	public static void pali() {
		int num = 12321;
		int res = rev(num);
		if(num==res) {
			int sum = digit_sum(num);
			System.out.println(sum);
		}
		else {
			System.out.println(num);
		}
		
	}
	
	public static void fact_rev() {
		int num = 24;
		for(int i=1; i<=(int)Math.sqrt(num); i++) {
			if(num%i==0) {
				System.out.println(num/i);
			}
		}
		for(int i=(int)Math.sqrt(num); i>=1; i--) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void print_pat1() {
		int rows = 5;
		int k = 0;
		int a = 65;
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				if(k%2==0) {
					System.out.print((char)a+" ");
				}
				else {
					System.out.print((char)(a+32)+" ");
				}
				k++;
				a++;
			}
			System.out.println();
		}
	}
	
	public static void print_pat() {
		int rows = 5;
		int k = 0;
		for(int i =1; i<=rows; i++) {
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(k%3+" ");
				k++;
			}
			System.out.println();
		}
	}
	
	public static int c_fact(int num) {
		int c = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pali();
		
		
//		int num = 2;
//		int count = 0;
//		int sum = 0;
//		while(count!=15) {
//			int fact = c_fact(num);
//			if(fact == 2) {
//				sum+=num;
//				count++;
//			}
//			num++;
//		}
//		System.out.println(sum);
		
		
		
		
	}

}
