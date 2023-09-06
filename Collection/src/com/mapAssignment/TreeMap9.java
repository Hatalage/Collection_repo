package com.mapAssignment;

import java.util.TreeMap;

//WAP to create a TreeMap with Integer as key and get a key-value mapping associated with 
//the greatest key and the least key in a map.
public class TreeMap9 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(103, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(106, "Shivani");
		System.out.println(map);
		
		int greatestKey = map.lastKey();
		String greatestValue = map.get(greatestKey);
		System.out.println("Greatest Key: "+greatestKey);
		System.out.println("Greatest Value: "+greatestValue);
		
		int leastKey = map.firstKey();
		String leastValue = map.get(leastKey);
		System.out.println("Lowest Key: "+leastKey);
		System.out.println("Lowest Value: "+leastValue);
		
	
}
}
