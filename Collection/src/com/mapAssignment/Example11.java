package com.mapAssignment;

import java.util.HashMap;

//WAP to search for an element from HashMap using key
public class Example11 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Lotus");
		map.put(102, "Rose");
		map.put(104, "Lily");
		map.put(106, "SunFlower");
		map.put(103, "Jasmine");
		map.put(105, "NightQueen");
		System.out.println(map);
		System.out.println("-----Search element from hashmap using key----");
		Integer key = 103;
		String val=map.get(key);
		
		if(val!=null)
		{
			System.out.println("The key "+key+" having value is:"+val);
		}
		else
		{
			System.out.println("The Key is not found");
		}
		
		
}
}