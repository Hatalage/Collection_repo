package com.mapAssignment;

import java.util.HashMap;

//WAP to add elements to a HashMap without using generics (ie do not use <>) and print 
//content of it. Use Integer as Key and String as Value. In second HashMap add elements of 
//String type as Key and Integer as Value.
public class Example1 {
public static void main(String[] args) {
	HashMap map1 = new HashMap();
	map1.put(11, "shiv");
	map1.put(13, "sayali");
	map1.put(15, "sharayu");
	map1.put(12, "sharda");
	map1.put(14, "sahana");
	System.out.println(map1);
	
	HashMap map2 = new HashMap();
	map2.put("mango", 50);
	map2.put("apple", 500);
	map2.put("pineapple", 45);
	map2.put("guava",30);
	map2.put("grapes",12);
	System.out.println(map2);
}
}
