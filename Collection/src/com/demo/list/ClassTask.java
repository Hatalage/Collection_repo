package com.demo.list;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassTask {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("shiv");
	list.add("ram");
	list.add("shiv");
	list.add("sam");
	list.add("ram");
	list.add("shiv");
	
	HashMap<String, Integer> map = new HashMap<>();
	int count;
	for(String names:list)
	{
		if(map.containsKey(names))
		{
		  count = map.get(names)+1;
		  map.put(names, count);
		}
		else
		{
			count=1;
			map.put(names,count);
	}
	}
	System.out.println(list);
	System.out.println(map);
	
	
}
}
