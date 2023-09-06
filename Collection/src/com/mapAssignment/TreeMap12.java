package com.mapAssignment;

import java.util.TreeMap;

//WAP to get a key-value mapping associated with the greatest key less than or equal to the 
//given key.
public class TreeMap12 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(110, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(109, "Shivani");
		System.out.println(map);
		
		int givenKey = 106;
		Integer floorKey = map.floorKey(givenKey);
		String floorValue = map.get(floorKey);
		
		System.out.println("key is: "+floorKey);
		System.out.println("value is :"+floorValue);
		
}
}