package com.mapAssignment;

import java.util.Map;
import java.util.TreeMap;

//WAP to get all keys from the given a TreeMap
public class TreeMap5 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(103, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(106, "Shivani");
		System.out.println(map);
		
		
		System.out.println("All the keys from Map are");
		for(Map.Entry<Integer, String>m: map.entrySet())
		{
			System.out.println(m.getKey()+" ");
		}
}
}