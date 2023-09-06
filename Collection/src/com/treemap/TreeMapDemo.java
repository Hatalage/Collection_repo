package com.treemap;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<Integer, String> map=  new TreeMap<Integer, String>();
	map.put(11, "vaish");
	map.put(22, "isha");
	map.put(34, "mansi");
	map.put(10, "leiza");
	map.put(40, "sharda");
	map.put(15, "sharyu");
	//TreeMap does not accept null key
	map.put(56, null);
	System.out.println("-----TreeMap----");
	for(Map.Entry<Integer, String>m: map.entrySet())
	{
		System.out.println(m.getKey()+" : "+m.getValue());
	}
	//Collections.synchronizedSortedMap(map);
	System.out.println("-----TreeMap----");
	SortedMap<Integer, String>smap=map.descendingMap();
	for(Map.Entry<Integer, String>m:smap.entrySet())
	{
		System.out.println(m.getKey()+" : "+m.getValue());
	}
	
	System.out.println("First Key: "+map.firstKey());
	System.out.println("Last Key: "+map.lastKey());
	
	System.out.println("HeadMap(40):"+map.headMap(40));
	System.out.println("TailMap(40):"+map.tailMap(40));
	
	System.out.println("SubMap(20,40)"+map.subMap(20, 40));
	System.out.println("LowerKey(40):"+map.lowerKey(40));
	System.out.println("HigherKey(40):"+map.higherKey(40));
	
	System.out.println("CelingKey(50):"+map.ceilingKey(50)); //returns greater or than equal to key and if no key then null
	System.out.println("floorKey(50):"+map.floorKey(50));    //returns less than or equal key
}
}
