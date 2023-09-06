package com.mapAssignment;

import java.util.TreeMap;

//WAP to delete all elements from a given TreeMap.
public class TreeMap6 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(103, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(106, "Shivani");
		System.out.println(map);
		
		map.clear();
		
		System.out.println("Map after deleting all elements");
		System.out.println(map);
		
}
}