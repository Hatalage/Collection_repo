package com.mapAssignment;

import java.util.TreeMap;

//WAP to get the first (lowest) key and the last (highest) key currently in a TreeMap.
public class TreeMap10 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(103, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(106, "Shivani");
		System.out.println(map);
		
		System.out.println("Lowest key is: "+map.firstKey());
		System.out.println("Highest key is: "+map.lastKey());
}
}