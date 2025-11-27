package com.jan26;

public class class9patt6 {
	
	public static int count_fact(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static int reverse(int num) {
		int res = 0;
		while(num!=0) {
			int rem = num%10;
			res = (res * 10) + rem;
			num = num / 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int num = 23;
		int res = reverse(num);
		int fact_num = count_fact(num);
		int fact_res = count_fact(res);
		if(fact_num == 2 && fact_res==2) {
			System.out.println("emirp");
		}
		else {
			System.out.println("its not");
		}
		
		
		
	}

}
