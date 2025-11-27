package com.novdec;

public class armstong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10000; i++) {
		int num = i;
		int temp = num;
		int n = num;
		int count = 0;
		int res = 0;
		
		while(num>0) {
			num=num/10;
			count+=1;
		}//count
		//num=temp;
		//System.out.println(count);
		
		while (temp > 0) {
			int rem = temp % 10;
			res = (int) ((Math.pow(rem, count))+res);
			temp = temp / 10;
		}//cal
		
		//System.out.println(res);
		if(res==n)
		{
		System.out.println(n);
		} //if
	}//for 
	}//main
}//class
