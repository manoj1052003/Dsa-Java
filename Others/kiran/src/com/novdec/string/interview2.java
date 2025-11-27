package com.novdec.string;

public class interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pavan is reading";
		
		String [] arr = str.split(" ");
		for (int i=0; i<arr.length; i++) {
			String rev = "";
			String word = arr[i];
			for (int j=0; j<word.length(); j++) {
				if(j==0) {
					rev = rev + (char)(word.charAt(j)-32);
				}
				else {
					rev = rev + word.charAt(j);
				}
				
			}
			System.out.print(rev+" ");
		}
		
	}

}
