package com.hashmap;

import java.util.HashMap;

public class HashmapDemo {
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
	
	System.out.println("------Map----");
	System.out.println(map);
	
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	
	System.out.println("------chech any key is present in map or not----");
	boolean ans = map.containsKey(108);
	System.out.println(ans);
	
	System.out.println("-----chech any value is present in map or not---");
	ans=map.containsValue("rama");
	System.out.println(ans);
	
	System.out.println("----chech any value is present in map or not---");
	System.out.println(map.entrySet());
	
	System.out.println(map.get(101));
	//map.clear();
	System.out.println(map);
	
	System.out.println(map.keySet());
	//set<Integer>kset=map.keySet();
	System.out.println(map.values());
	//Collection<String>list=map.values();
	
}
}
