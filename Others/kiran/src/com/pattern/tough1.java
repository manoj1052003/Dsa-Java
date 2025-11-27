package com.pattern;

public class tough1 {
	
	public static int reverse(int num,int res) {
		if (num==0) {
			return res;
		}
		return reverse(num/10,((res*10)+(num%10)));
	}
	
	public static boolean check_palindrome(int num) {
		int res = reverse(num,0);
		if (res==num) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 8;
		int k = 1;
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i;j++) {
				while(true) {
					boolean ans = check_palindrome(k);
					if(ans==true) {
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
