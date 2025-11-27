package com.april;

public class happynum {

	public static int ishappy(int num)
	{
		int a=0;
		int sum=0;
		
		while(num>0)
		{
			a=num%10;
			sum=sum+(a*a);
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int num=112;
		int result=num;
		while(result!=1 && result!=4)
		{
			result=ishappy(result);
		}
	}
}

