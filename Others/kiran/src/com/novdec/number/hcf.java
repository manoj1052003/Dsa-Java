package com.novdec.number;

public class hcf {
	
	public static int find_hcf(int a,int b) {
		int smt = 0;
		int cf = 0;
		if(a<b) {
			smt=a;
		}
		else {
			smt=b;
		}
		for (int i=1; i<=smt; i++) {
			if(a%i==0 && b%i==0) {
				cf=i;
			}
		}
		return cf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =6;
		int b =12;
		int ans= find_hcf(a,b);
		System.out.println(ans);
		
	}

}
