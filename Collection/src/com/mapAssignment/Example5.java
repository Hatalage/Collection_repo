package com.mapAssignment;

import java.util.HashMap;
import java.util.Map;

//WAP to get all the entries from a HashMap. 
//Iterate the entries and print the Key & Value.
public class Example5 {
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
