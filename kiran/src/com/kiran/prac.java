package com.kiran;
import java.util.*;
public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'p','e','n','t','a','g','o','n'}; 
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+" ");
			System.out.println(entry.getValue());
		}
	}

}
