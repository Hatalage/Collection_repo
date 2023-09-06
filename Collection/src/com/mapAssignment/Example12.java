package com.mapAssignment;

import java.util.HashMap;

//WAP to test if a HashMap contains a mapping for the specified value.
public class Example12 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Lotus");
		map.put(102, "Rose");
		map.put(104, "Lily");
		map.put(106, "SunFlower");
		map.put(103, "Jasmine");
		map.put(105, "NightQueen");
		System.out.println(map);
		
		System.out.println("Mapping for the specified key");
		boolean ans=map.containsValue("Jasmine");
		System.out.println("map.containsValue(Jasmine): "+ans);
}
}