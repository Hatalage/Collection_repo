package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CustomMapTest {
public static void main(String[] args) {
	HashMap<Student, String> stumap=new HashMap<Student, String>();
	stumap.put(new Student(111, "pooja",78), "html");
	stumap.put(new Student(113, "leena",56), "css");
	stumap.put(new Student(112, "samir",69), "html");
	stumap.put(new Student(114, "sharda",63), "css");
	stumap.put(new Student(115, "rahul",59), "html");
	stumap.put(new Student(116, "neha",56), "js");
	
	System.out.println("----Student list----");
	for(Map.Entry<Student, String> m: stumap.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	HashMap<String, Integer> stumap1=new HashMap<String, Integer>();
	System.out.println("----new Map----");
	int count;
	for(Map.Entry<Student, String> m : stumap.entrySet())
	{
		if(stumap1.containsKey(m.getValue()))
{
	count=stumap1.get(m.getValue())+1;
	stumap1.put(m.getValue(), count);
}
		else
		{
			count=1;
			stumap1.put(m.getValue(), count);
		}
	}
	for(Map.Entry<String, Integer> s: stumap1.entrySet())
	{
		System.out.println(s.getKey()+" "+s.getValue());
	}
}
}
