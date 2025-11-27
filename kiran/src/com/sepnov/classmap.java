package com.sepnov;
import java.util.*;
public class classmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"kiran", "kumar","kiran","rama","kumar","kiran","kiran"};
		Map<String,Integer> map = new HashMap<>();
		System.out.println(map);
		for(String names : arr) {
			if(map.containsKey(names)) {
				map.put(names, map.get(names)+1);
			}
			else {
				map.put(names, 1);
			}
		}
		System.out.println(map);
		map.remove("kiran");
		System.out.println(map);
	}

}
