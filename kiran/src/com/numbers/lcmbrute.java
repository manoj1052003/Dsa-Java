package com.numbers;

public class lcmbrute {
	
	static void find_lcm(int a, int b) {
		
		int greater = 0;
		
		if (a>b) {
			greater= a;
		}
		
		else {
			greater = b;
		}
		
		for (int i= greater; i<= (a*b); i++) {
			if (i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		find_lcm(a,b);
		
	}

}
