package com.strings;
public class newstring {
	public static void main(String[] args)
	{
		String st = "lax4h2h6hh8";
		int length = st.length();
		
		char [] arr = st.toCharArray();
		int count = 0;
		int sum = 0;
		
		
		for (int i=0; i < arr.length; i++) {
			
			if (arr[i]>=48 && arr[i]<=57) {
				
				count+=1;
				sum += arr[i]-48;
			}
			
			
		}
		System.out.println(sum);
		


}
	
}
