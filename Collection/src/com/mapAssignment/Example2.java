package com.mapAssignment;

import java.util.HashMap;

//WAP add elements to HashMap without using generics, 0th location use String as key and 
//Integer as value, on 1st location use String as key String and Integer as value.
public class Example2 {
public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("Shivani", 1210);
	map.put(2000, "Hatalage");
	System.out.println(map);
}
}
