package com.mapAssignment;

import java.util.TreeMap;

//WAP to create a Treemap which contains Strings
public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("Shivani", "Hatalage");
		map.put("Ulka", "Sawakare");
		map.put("Sharda", "Bhole");
		map.put("Swati", "Bhokare");
		map.put("Nilam", "Jagade");
		map.put("Sapna", "kale");
		System.out.println(map);
}
}