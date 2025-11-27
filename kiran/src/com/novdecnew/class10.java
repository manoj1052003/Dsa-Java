package com.novdecnew;

public class class10 {
	
	public static int print_fact(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		float sum = 0;
		for(int i=1; i<=10000; i++) {
			int num = i;
			int fact = print_fact(num);
			if(fact == 2) {
				//System.out.println(num);
				sum+=num;
				count++;
			}
			if(count==15) {
				System.out.println(sum/count);
				break;
			}
		}
		
		
	}

}
