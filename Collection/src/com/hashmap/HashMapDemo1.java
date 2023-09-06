package com.hashmap;

import java.util.HashMap;

public class HashMapDemo1 {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	System.out.println(map.put(101, "pooja"));
	System.out.println(map.put(102, "meena"));
	System.out.println(map.put(103, "leena"));
	
	System.out.println("-----Map---");
	System.out.println(map);
	
}
}
