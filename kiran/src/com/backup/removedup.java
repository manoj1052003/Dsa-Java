package com.backup;
import java.util.*;
public class removedup {
	
	public static int check_res() {
		int a = 5;
		try{
			if(a>=5) {
				return 1;
			}
		}
		finally {
			return 2;
		}
	}

	public static void main(String[] args) {
		int res = check_res();
		System.out.println(res);
	}
}
