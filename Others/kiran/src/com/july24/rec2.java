package com.july24;

public class rec2 {
	
	public static int print_num(int num,int count) {//num= 0
		if(num==0) {								//count =3
			return count;
		}
		return print_num(num/10,count=count+1);
	}
	
	public static int check_arm(int num,int res, int digit) {
		if(num==0) {
			return res;
		}
		return check_arm(num/10,res+(int)Math.pow((num%10), digit),digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 152;
		int digit = print_num(num,0);//3
		int res = check_arm(num,0,digit);
		//System.out.println(res);
		if(res==num) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("its not");
		}
		
	}
}
