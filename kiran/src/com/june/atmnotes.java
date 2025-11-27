package com.june;

public class atmnotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 280;
		int [] arr = new int[201];
		while(num/100>=1) {
			num = num -100;
			arr[100] = arr[100] + 1;
		}
		while(num/50>=1) {
			num = num -50;
			arr[50] = arr[50] + 1;
		}
		while(num/20>=1) {
			num = num -20;
			arr[20] = arr[20] + 1;
		}
		while(num/10>=1) {
			num = num -10;
			arr[10] = arr[10] + 1;
		}
		System.out.println("100 : "+arr[100]);
		System.out.println("50 : "+arr[50]);
		System.out.println("20 : "+arr[20]);
		System.out.println("10 : "+arr[10]);
	}

}
