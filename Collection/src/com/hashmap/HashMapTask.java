package com.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTask {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(101, "sharda");
	map.put(102, "ulka");
	map.put(106, "nilam");
	map.put(103, "swati");
	map.put(105, "sapna");
	map.put(104, "pallavi");
	map.put(107, "vanshika");
	System.out.println(map);
	
	System.out.println("hashmap key by using set");
	Set<Integer> key= map.keySet();
	for(Integer n: key)
	{
		System.out.println(n);
	}
	
	System.out.println("hashmap key and value pair by using set");
	for(Integer n: key)
	{
		System.out.println(n+" : "+map.get(n));
	}
	
	System.out.println("----Using map----");
	Set<Entry<Integer, String>> entries = map.entrySet();
	System.out.println(entries);
}
}
