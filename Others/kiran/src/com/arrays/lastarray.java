package com.arrays;

public class lastarray {
	
	static int [] merge_two_arr(int [] a, int [] b) {
		
		int [] res = new int [a.length+b.length];
		int i =0;
		int j =0;
		int k =0;
		
		while(i < a.length && j < b.length) {
			
			if ( a[i]< b[j]) {
				res[k]=a[i];
				i++;
				k++;
			}
			else {
				res[k]=b[j];
				j++;
				k++;	
			}
		}
		
		while (i< a.length) {
			res[k] = a[i];
			k++;
			i++;
		}
		
		while(j<b.length) {
			res[k]=b[j];
			j++;
			k++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {2,4,8,10,12,14};
		int [] b = {3,9,15,20,24};
		
		int [] res = merge_two_arr(a,b);
		
		for (int i =0; i < res.length; i++) {
			System.out.println(i+"---->"+res[i]);
		}
		
		
		

	}

}
