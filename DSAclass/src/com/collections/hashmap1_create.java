package com.collections;
import java.util.*;
public class hashmap1_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("ONE"));
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
	}

}
