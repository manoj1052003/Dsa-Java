package com.kiran;

public class coco {
	public static boolean check(int num) {
		for(int i=3; i<num ;i++) {
			if(num%i==0) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		if(num<=2) {
			System.out.println("false");
		}
		else {
			boolean res = check(num);
			System.out.println(res);
		}

	}

}
