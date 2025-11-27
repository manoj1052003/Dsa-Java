package com.leetcode75;
import java.util.*;
public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2,7,11,15};
		int target = 13;
		int [] arr = new int[2];
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		System.out.println(map);
		for(int i=0; i<nums.length; i++) {
			int ex = target - nums[i];
			if(map.containsKey(ex) && map.get(ex)!=i) {
				arr[0] = i;
				arr[1] = map.get(ex);
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println(map);
	}
}
