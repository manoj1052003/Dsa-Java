package com.leetcode75;
import java.util.*;
public class containsduplicate {
	    public static boolean my_approach(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                 map.put(nums[i],map.get(nums[i])+1);
	            }
	            else{
	                map.put(nums[i],1);
	            }
	            if(map.get(nums[i])>1){
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4};
		boolean res = my_approach(nums);
		System.out.println(res);
	}

}
