package com.mapAssignment;
//WAP to copy a TreeMap content to another TreeMap
import java.util.TreeMap;

public class TreeMap7 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(101, "Shiv");
		map1.put(103, "Shona");
		map1.put(104, "Shivi");
		map1.put(102, "Shivu");
		map1.put(105, "Shonu");
		map1.put(106, "Shivani");
		
		
		TreeMap<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.putAll(map1);
		System.out.println("The copied TreeMap is: "+map2);
}
}