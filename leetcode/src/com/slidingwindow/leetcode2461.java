package com.slidingwindow;
import java.util.*;
public class leetcode2461 {
	//using map
	public long maximumSubarraySum(int[] nums, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        long sum = 0;
        long max_sum = 0;
        while(j<nums.length) {
        	map.put(nums[j],map.getOrDefault(nums[j], 0)+1);
        	sum += nums[j];
        	if(j-i+1 == k) {
        		if(map.size()==k) {
        			max_sum = Math.max(max_sum, sum);
        		}
        		sum-=nums[i];
        		map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
        		i++;
        	}
        	j++;
        }
        return max_sum;
    }
	
	//using set
	public long maximumSubarraySum1(int[] nums, int k) {
		HashSet<Integer> set = new HashSet<>();
		int i = 0;
		int j = 0;
		long sum = 0;
		long max_sum = 0;
		while(j<nums.length) {
			while(set.contains(nums[j])) {
				sum-=nums[i];
				set.remove(nums[i]);
				i++;
			}
			
			sum+=nums[j];
			set.add(nums[j]);

			if(j-i+1==k) {
				max_sum = Math.max(max_sum, sum);
				set.remove(nums[i]);
				sum-=nums[i];
				i++;
			}
			j++;
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
