package com.hashmap;

import java.util.HashMap;

public class GetMethodDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "shivansh");
		map.put(102, "Devansh");
		map.put(105, "shivani");
		map.put(103, "shreyash");
		map.put(104, "Shiv");
		map.put(null, "Sushant");
		map.put(106, "Ansh");
		
		System.out.println("------Map----");
		System.out.println(map);
		System.out.println(map.get(106));
		
		
		
}
}