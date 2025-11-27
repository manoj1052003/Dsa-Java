package com.july;

public class frstclas {
	
	public static int fact(int num) {
	int res = 1;
	for(int i=1; i<=num; i++) {
		res = res * i;
	}
	return res;
	}
	
	public static int find_krish(int num) {
		int sum = 0;
		while(num!=0) {
			int rem = num % 10;  //1
			sum = sum + fact(rem); // 145
			num = num/10;  //0
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145;
		int res = find_krish(num);
		if(num==res) {
			System.out.println("its krishn");
		}
		else {
			System.out.println("its not");
		}
		
	}

}
