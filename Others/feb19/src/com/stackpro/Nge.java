package com.stackpro;

import java.util.Arrays;
import java.util.Stack;

public class Nge {

	public static void main(String[] args) {
		int [] arr = {55,75,50,60};
		int n = arr.length;
		int [] res = new int [n];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=n-1; i>=0; i--) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				res[i] = -1;
			}
			else {
				res[i] = st.peek();
			}
			st.push(arr[i]);
		}
		System.out.println(Arrays.toString(res));

	}

}
