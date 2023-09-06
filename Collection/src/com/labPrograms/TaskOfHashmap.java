package com.labPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskOfHashmap {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(101, "Shiv");
	map.put(102, "Shreyas");
	map.put(105, "Sayali");
	map.put(103, "Isha");
	map.put(109, "Vaish");
	map.put(107, "Rani");
	Iterator<Map.Entry<Integer, String>> m = map.entrySet().iterator();
	while(m.hasNext())
	{
		Map.Entry<Integer,String> m2= m.next();
		System.out.println(m2.getKey());
		System.out.println(m2.getValue());
	}
	
	
}
}
