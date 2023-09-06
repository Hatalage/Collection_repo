package com.mapAssignment;

import java.util.TreeMap;

//WAP to create a Treemap which contains Integers
public class TreeMap1 {
public static void main(String[] args) {
	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	map.put(12, 10);
	map.put(23,12);
	map.put(44,78);
	map.put(2,18);
	map.put(19,40);
	map.put(20,13);
	map.put(15,3);
	System.out.println(map);
}
}
