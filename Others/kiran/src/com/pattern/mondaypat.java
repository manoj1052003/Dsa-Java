package com.pattern;

public class mondaypat {
	public static int reverse(int num) {
		int res = 0;
		while(num!=0) {
			int rem = num%10;
			res = (res *10)+rem;
			num= num/10;
		}
		return res;
	}
	
	public static boolean check_pali(int num) {
		int res = reverse(num);
		if (num == res) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 7;
		int k = 1;
		for (int i=1; i<=rows; i++) {
			for (int j =1 ;j <=i; j++) {
				 while(true) {
					 boolean ans = check_pali(k);
					 if (ans == true) {
						 System.out.print(k+" ");
							k++; 
							break;
					 }
					 else {
						 k++;
					 }
				 }
			}
			System.out.println();
		}

	}

}
