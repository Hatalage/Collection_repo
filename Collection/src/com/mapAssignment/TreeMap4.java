package com.mapAssignment;

import java.util.TreeMap;

//WAP to search a value in a TreeMap
public class TreeMap4 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "Shiv");
		map.put(103, "Shona");
		map.put(104, "Shivi");
		map.put(102, "Shivu");
		map.put(105, "Shonu");
		map.put(106, "Shivani");
		System.out.println(map);
		
		String val = "Sharda";
		if(map.containsValue(val))
		{
			System.out.println("The tree contains the key :"+val);
		}
		else
		{
			System.out.println("The treemap doesn't contains key : "+val);
		}
}
}