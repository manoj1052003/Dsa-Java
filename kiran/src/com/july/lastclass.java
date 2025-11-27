package com.july;

public class lastclass {
	
	public static String check(String s) {
		int i = 0;
        int j = 0;
        String res = "";
        while(i<s.length() && j<s.length()){
            int count = 0;
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
                count++;
            }
            if(count%2!=0){
                res = res + s.charAt(i);
            }
            i = j;
        }
        if(res.equals(s)) {
        	return res;
        }
        else {
        	return check(res);
        }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
	    
		String res = check(s);
		if(res.equals(s)) {
			s = res;
			res = check(s);
		}
		else {
			if(res.length()==0){
	            System.out.println("Empty String");
	        }
			else {
				System.out.println(res);
			}
	        
		}
           
		
	}

}
