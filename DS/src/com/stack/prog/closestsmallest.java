package com.stack.prog;

import java.util.Stack;

public class closestsmallest {
	
	public static void solution1(int [] arr){
		for(int i=0; i<arr.length; i++) {
			int val = -1;
			for(int j=i-1; j>=0; j--) {
				if(arr[j]<arr[i]) {
					val = arr[j];
					break;
				}
			}
			System.out.print(val+" ");
			
		}
	}
	
	public static void solution2(int [] arr) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && st.peek() > arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				st.push(arr[i]);
				System.out.print(-1+" ");
			}
			else if(st.peek()<arr[i]) {
				System.out.print(st.peek()+" ");
				st.push(arr[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {1,7,1,6,5};
		solution1(arr);

	}

}
