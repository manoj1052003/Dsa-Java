package com.test;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,7,4,99,45,3,4,1,4,4,1};
		int [] res = new int [1000];
		for(int val : arr) {
			res[val] = res[val] + 1;
		}
		for(int i=0; i<res.length; i++) {
			if(res[i]==1) {
				System.out.println(i);
			}
		}
	}

}
