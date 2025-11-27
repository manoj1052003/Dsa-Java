package com.pattern;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" "+" ");
			}
			for(int j=n; j>=n+1-i; j--) {
				System.out.print(j+" ");
			}
			for(int j=n+2-i; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
