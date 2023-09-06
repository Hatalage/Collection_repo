package com.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashmapDemo {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> lmap= new LinkedHashMap<Integer, String>();
	lmap.put(101,"Shiv");
	lmap.put(102,"Krishna");
	lmap.put(103,"Shyam");
	lmap.put(104,"Ram");
	lmap.put(105,"Sita");
	lmap.put(106,"Isha");
	System.out.println("-----Map----");
	System.out.println(lmap);
	System.out.println(lmap.remove(103,"Shyam"));
	System.out.println(lmap);
	
	System.out.println(lmap.replace(104,"Sam"));
	System.out.println(lmap);
	
	System.out.println(lmap.replace(104, "Sam", "Sunny"));
	System.out.println(lmap);
	
	boolean ans = lmap.containsKey(103);
	System.out.println(ans);
}
}
