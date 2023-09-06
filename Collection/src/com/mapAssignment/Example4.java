package com.mapAssignment;

import java.util.HashMap;

//WAP to create a map using Wrapper class as key and value same as keys’ data type WAP to 
//count the number of key-value (size) mappings in a map
public class Example4 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "swati");
		map.put(102, "swamini");
		map.put(105, "shivani");
		map.put(103, "sonu");
		map.put(104, "monu");
		map.put(null, "pooja");
		map.put(107, null);
		map.put(106, null);
		map.put(108, "ram");
		
		System.out.println("------Map----");
		System.out.println(map);
		
		System.out.println("The size of the map is: "+map.size());
}
}