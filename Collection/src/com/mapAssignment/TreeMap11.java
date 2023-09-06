package com.mapAssignment;

import java.util.NavigableSet;
import java.util.TreeMap;

//WAP to get a reverse order view of the keys contained in a given map TreeMap.
public class TreeMap11 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(103, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(106, "Shivani");
		System.out.println("Original TreeMap is: "+map);
		NavigableSet<Integer> reversKey = map.descendingKeySet();
		System.out.println("TreeMap after reversing keys : "+reversKey);
		
}
}