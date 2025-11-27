package com.april;

public class armstr {

public static int find_digit(int num)
{
	int digit=0;
	while(num>0) {
		num=num/10;
		digit++;
}
	return digit;
	}
public static int check_armstrong(int num) {
	int res=0;
	int digits=find_digit(num);
	while(num!=0) {
		int rem=num%10;
		res=(int)Math.pow(rem, digits)+res;
		num=num/10;
		
	}
	return res;
}
public static void main(String[] args) {

	for(int k=1;k<10000;k++)
	{
		int num=k;
		int res=check_armstrong(num);
		if(num==res) {
			System.out.println(num);
		}
		
	}
	
	}
}
