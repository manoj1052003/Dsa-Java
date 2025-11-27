package com.dp;

public class class7ninjatraining {

	public static int find_ans(int day, int last, int [] [] points) {
		if(day == 0) {
			int maxi = 0;
			for(int i=0; i<=2; i++) {
				if(i!=last) {
					maxi = Math.max(maxi, points[0][i]);
				}
			}
			return maxi;
		}
		int maxi = 0;
		for(int i=0 ; i<points[0].length; i++) {
			if(i!=last) {
				int activity = points[day][i] + find_ans(day-1 , i, points);
				maxi = Math.max(maxi, activity);
				
			}
			
		}
		return maxi;
	}
	
	//kiran approach
	public static int find_ans1(int day, int last, int [] [] points) {
		if(day==0) {
			int maxi = 0;
			for(int i=0; i<points.length; i++) {
				if(i!=last) {
					maxi = Math.max(maxi, points[0][i]);
				}
			}
			return maxi;
		}
		
		
		
		int maxi = 0;
		for(int i = 0 ; i<points.length; i++) {
			if(i!=last) {
				int prevdaybest = find_ans(day-1, i, points);
				int curr = points[day][i];
				int totaltoday = prevdaybest + curr;
				maxi = Math.max(totaltoday, maxi);
				//update maximum value;
			}
		}
		return maxi;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] [] points = {{2,1,3},{3,4,6},{10,1,6},{8,3,7}}; 
		 int res = find_ans(points.length-1,3,points);
		 System.out.println(res);
	}
}
