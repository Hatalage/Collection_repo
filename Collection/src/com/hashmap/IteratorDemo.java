package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IteratorDemo {
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
	
	System.out.println("----map iterate using keyset()---");
	for(Integer keys:map.keySet())
	{
		System.out.println(keys);//+" : "+map.get(keys));
	}
	
	System.out.println("------map iterate using values()---");
	for(String val:map.values())
	{
		System.out.println(val);
	}
	
	System.out.println("------map iterate using entrySet()----");
	for(Map.Entry<Integer, String>s:map.entrySet())
	{
		System.out.println(s.getKey()+" "+s.getValue());
	}
}
}
