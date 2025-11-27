package com.arrays;

public class mergearray {
	
	static int[] merge_two_sortedarrays(int[]a,int[]b) {
		int [] res = new int [a.length+b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j < b.length) {
			if (a[i]<b[j]) {
				res[k] = a[i];
				i+=1;
				k+=1;
			}
			else {
				res[k] = b[j];
				j+=1;
				k+=1;
				
			}
		}
		
		while(i < a.length) {
			res[k] = a[i];
			i+=1;
			k+=1;	
		}
		
		while(j < b.length) {
			res[k] = b[j];
			j+=1;
			k+=1;
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1,5,8,23,34,45,56,67,78};
		int [] arr2 = {2,4,7,13,24,35};
		int [] res = merge_two_sortedarrays(arr1,arr2);
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		
	}

}
