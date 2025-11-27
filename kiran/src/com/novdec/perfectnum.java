package com.novdec;


public class perfectnum {

	public static void main(String[] args) {
		for(int i=1;i<1000000;i++) {
		// TODO Auto-generated method stub
	int num=i;
	int sum=0;
	for(int j=1;j<num;j++)
	{
		if(num%j==0)
		{
			sum=j+sum;
		}
	}
	if(num==sum)
	{
		System.out.println(num + " is a perfect number ");
	}
	
	}
	}
}
