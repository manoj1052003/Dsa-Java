package com.backup;

public class day11 {
	
	public static int check_happyr(int num) {
		if(num==1 || num == 4) {
			return num;
		}
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res+=(rem*rem);
			num = num / 10;
		}
		return check_happyr(res);
	}
	
	public static int check_happy(int num) {
		int res = 0;
		while(num!=0) {
			int rem = num % 10;
			res+=(rem*rem);
			num = num / 10;
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int res = check_happyr(num);
		System.out.println(res);
		
		
		//while(res!=1 && res!=4) {
			//res = check_happy(res);
		//}
		if(res == 1) {
			System.out.println("its happy");
		}
		else {
			System.out.println("its not");
		}
	}

}
