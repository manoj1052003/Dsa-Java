package com.june;

public class atmnotesstud {
	
	public static void main(String[] args) {
		int num = 280;
		int [] arr = new int[101];
		while(num/100>=1) {
			arr [100] = arr[100] + 1;
			num = num - 100;
		}
		while(num/50>=1) {
			arr [50] = arr[50] + 1;
			num = num - 50;
		}
		while(num/20>=1) {
			arr [20] = arr[20] + 1;
			num = num - 20;
		}
		while(num/10>=1) {
			arr [10] = arr[10] + 1;
			num = num - 10;
		}
		System.out.println("100 : "+arr[100]);
		System.out.println("50 : "+arr[50]);
		System.out.println("20 : "+arr[20]);
		System.out.println("10 : "+arr[10]);
		
	}

}
