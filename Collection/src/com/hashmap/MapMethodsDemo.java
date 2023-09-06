package com.hashmap;

import java.util.HashMap;

public class MapMethodsDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "swati");
		map.put(102, "swamini");
		map.put(105, "shivani");
		map.put(103, "sonu");
		map.put(104, "monu");
		map.put(102, "pooja");
		map.put(103, "pooja");
		map.put(107, null);
		map.put(106, null);
		map.put(108, "ram");
		
		System.out.println(map.remove(11)); //remove entry and return value 
		//if key is not present return null
		
		System.out.println(map.remove(102, "pooja"));
		//return true if found key and value(key associated value)
		//return false if pair not found
		//removes all entrys which have same keys like 102 it'll remove 
		//not removes entrys which have same values like pooja come two times it'll not remove
		System.out.println(map);
		
		System.out.println(map.replace(104,  "shyam"));
		System.out.println(map);
		System.out.println(map.replace(105,  "shivani", "aditi"));
		System.out.println(map);
		
		

}
}
