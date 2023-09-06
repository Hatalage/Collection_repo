package com.mapAssignment;

import java.util.HashMap;

//WAP to remove an element from HashMap using key
public class Example13 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Lotus");
		map.put(102, "Rose");
		map.put(104, "Lily");
		map.put(106, "SunFlower");
		map.put(103, "Jasmine");
		map.put(105, "NightQueen");
		System.out.println(map);
		
		System.out.println(map.remove(106));
		System.out.println(map);
}
}