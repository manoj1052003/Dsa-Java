package com.patterns;

import java.util.HashMap;

public class class3 {

	public static void main(String[] args) {
		String s = "malayalamaa";
		HashMap<Character, Integer> map = new HashMap<>();
		System.out.println(map);
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
		for(Character ch : map.keySet()) {
			System.out.println(ch+" : "+map.get(ch));
		}
		
	}

}

