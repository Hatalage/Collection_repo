package com.mapAssignment;

import java.util.HashMap;

//WAP to test a HashMap is empty or not
public class Example9 {
public static void main(String[] args) {
	HashMap<Integer, String>map1 = new HashMap<Integer, String>();
	System.out.println("Before inserting entries in Hashmap: "+map1.isEmpty());
	map1.put(101, "Lotus");
	map1.put(102, "Rose");
	map1.put(104, "Lily");
	map1.put(106, "SunFlower");
	map1.put(103, "Jasmine");
	map1.put(105, "NightQueen");
	System.out.println("After inserting entries in Hashmap: "+map1.isEmpty());
}
}
