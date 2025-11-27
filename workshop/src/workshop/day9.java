package workshop;
import java.util.*;
public class day9 {
	
	public static void reverse(String s) {
		String res = "";
		for(int i=s.length()-1; i>=0; i--) {
			res = res + s.charAt(i);
		}
		System.out.print(res+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABDEF";
		String res1 ="";
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int ascii = c+1;
			char nc = (char)ascii;
			res1 = res1 + nc;
		}
		System.out.println(res1);
		reverse(res1);
		
	}

}
