package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//WAP to add elements to a HashMap using generics with Integer as Key and String as value.
//And 4 key-value Map.Entry
public class Example3 {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(101, "Lotus");
	map.put(102, "Rose");
	map.put(104, "Lily");
	map.put(106, "SunFlower");
	map.put(103, "Jasmine");
	map.put(105, "NightQueen");
	for(Map.Entry<Integer, String> flower: map.entrySet())
	{
		System.out.println(flower.getKey()+" "+flower.getValue());
	}
}
}
