package com.kiran;

public class MakeBouquets {

	static boolean isPossibleSoln(int[] ar, int boq, int flowers, int m){
		int adj=0, bc=0;
		for (int i=0; i<ar.length;i++) {
			if (ar[i]<=m) 
			{
				adj++;
				if (adj==flowers)
				{
					bc++;
					if (bc==boq)
					{
						return true;
					}
					adj=0;
				}
				
				}
			else
			{
				adj=0; 
			}
		}
		return false;
	}
	
	
	static int minDayBouquets(int[] ar, int boq,int flowers) {
		if (boq*flowers >ar.length) {
			return -1;
		}
		int l=ar[0],h=ar[0];
		
		for (int i=0; i<ar.length; i++) {
			if (ar[i]<l) {
				l=ar[i];
				
			}
			if (ar[i]>h){
				h=ar[i];
			}
			
		}
		int res = -1;
		while(l<=h) {
			int m =(l+h)/2;
					
			if (isPossibleSoln(ar,boq,flowers,m)==true) {
				res=m;
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		
		return res;
		
	}
	
	
	public static void main(String[] args) {
		int[]ar = {2,5,2,9,3,10,4,6,5,6};
		int boq =4;
		int flowers=2;
		
		System.out.println(minDayBouquets(ar,boq,flowers));

	}

}

