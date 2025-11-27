package com.kiran;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class longsubkdistchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcadbbbbaccbdef";
		int k = 3;
		Map<Character, Integer> map = new HashMap<>();
		int i = -1, j = -1, len = -1;
		while(i<s.length()-1) {
			while(i<s.length()-1) {
				i++;
				char ch = s.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				if(map.size()<k) {
					continue;
				}
				else if(map.size()==k) {
					len = Math.max(len, i-j);
					System.out.println(s.substring(j+1, i+1));
				}
				else {
					break;
				}
			}
			while(j<i) {
				j++;
				char ch = s.charAt(j);
				if(map.get(ch)==1) {
					map.remove(ch);
				}
				else {
					map.put(ch, map.get(ch)-1);
				}
				if(map.size()==k) {
					System.out.println(s.substring(j+1, i+1));
					break;
				}
				else {
					continue;
				}
			}
		}
		System.out.println(len);
		
	}

}
