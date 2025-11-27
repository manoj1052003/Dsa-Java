package com.june;

public class recnum1 {
public static int rec_rev(int num, int res) {
	if(num==0) {
		return res;
	}
	return rec_rev(num/10,(res*10)+num%10);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int res = rec_rev(num,0);
		System.out.println(res);
		
	}

}
