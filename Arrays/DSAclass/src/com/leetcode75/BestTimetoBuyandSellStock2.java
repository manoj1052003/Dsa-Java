package com.leetcode75;

public class BestTimetoBuyandSellStock2 {
	
	
	public static int faster_approach(int [] prices) {
		int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i =0;i<prices.length;i++){
            min_price = Math.min(min_price, prices[i]);
            max_profit = Math.max(max_profit, prices[i] - min_price);
        }
        return max_profit;
	}

	public static void main(String[] args) {
		// Auto-generated method stub
		int [] prices = {7,1,5,3,6,4};
		int buy = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if( prices[i] - buy > profit){
                profit = prices[i] - buy;
            }
        }
        System.out.println(profit);
        
        int res = faster_approach(prices);
		System.out.println(res);
	}

}
