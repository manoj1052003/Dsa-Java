	package com.onlinejavapro;

public class class25string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// converting string in to lower case
		String s = "PENTagonSPace";  //javaclass
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);   // c = J --> 74
			if(c >=65 && c<=90) {
				int nascii = c + 32;   //106-32 ==> 74
				char nc = (char)nascii;
				//System.out.println(nc);
				res = res + nc;
			}
			else {
				//System.out.println(c);
//				int nascii = c + 32;   
//				char nc = (char)nascii;
				//System.out.println(nc);
				res = res + c;
			}
		}
		System.out.println(res);
	}

}
