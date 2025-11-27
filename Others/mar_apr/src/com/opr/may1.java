package com.opr;

import java.util.HashMap;
import java.util.Map;

public class may1 {

	public static void main(String[] args) {
		String s = "malayalam";
		HashMap<Character, Integer> map = new HashMap<>();
		char arr[] = s.toCharArray();
		for(char c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for(Character key : map.keySet()) {
			if(map.get(key) > 1) {
				System.out.println(key);
			}
		}
		
		for(Map.Entry<Character, Integer> mp: map.entrySet()) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
	}

}
