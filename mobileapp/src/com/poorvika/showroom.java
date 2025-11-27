package com.poorvika;

import java.util.Scanner;

public class showroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("en kodtiya??");
		String organ = sc.nextLine();
		Mobile m = Poorvika.get_mobile(organ);
		if(m!=null) {
			m.v_call();
		}
	}

}
