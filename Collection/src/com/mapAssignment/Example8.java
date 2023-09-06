package com.mapAssignment;

import java.util.HashMap;

//WAP to copy all of the mappings from the specified HashMap to another map.
public class Example8 {
public static void main(String[] args) {
	HashMap<Integer, String>map1 = new HashMap<Integer, String>();
	map1.put(101, "Lotus");
	map1.put(102, "Rose");
	map1.put(104, "Lily");
	map1.put(106, "SunFlower");
	map1.put(103, "Jasmine");
	map1.put(105, "NightQueen");
	System.out.println("HashMap 1 is: "+map1);
	
	HashMap<Integer, String>map2 = new HashMap<Integer, String>();
	map2.putAll(map1);
	System.out.println("HashMap 2 is: "+map2);
	
}
}
