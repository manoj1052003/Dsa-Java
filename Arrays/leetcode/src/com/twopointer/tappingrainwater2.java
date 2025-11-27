package com.twopointer;

public class tappingrainwater2 {
	
	public static void find_ans(int [] arr) {
		int res = 0;
		int lmax = arr[0];
		int rmax = arr[arr.length-1];
		int left = 0;
		int right = arr.length-2;
		
		while(left<=right) {
			if(lmax<=rmax) {
				res += Math.max(0, lmax - arr[left]);
				lmax = Math.max(lmax, arr[left]);
				left++;
			}
			else {
				res += Math.max(0, rmax-arr[right]);
				rmax = Math.max(rmax, arr[right]);
				right--;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 1, 5, 3, 1, 0, 4};
		find_ans(arr);
	}

}
