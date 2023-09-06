package com.mapAssignment;

import java.util.TreeMap;

//WAP to search a key in a TreeMap.

public class TreeMap3 {
public static void main(String[] args) {
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	map.put(101, "Shiv");
	map.put(103, "Shona");
	map.put(104, "Shivi");
	map.put(102, "Shivu");
	map.put(105, "Shonu");
	map.put(106, "Shivani");
	System.out.println(map);

	Integer key = 107;
	if(map.containsKey(key))
	{
		System.out.println("The tree contains the key :"+key);
	}
	else
	{
		System.out.println("The treemap doesn't contains key : "+key);
	}
}
}
