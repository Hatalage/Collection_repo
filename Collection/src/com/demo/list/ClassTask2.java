package com.demo.list;

import java.util.ArrayList;

public class ClassTask2 {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("html");
	list1.add("css");
	list1.add("python");
	list1.add("ruby");
	list1.add("java");
	System.out.println("list 1 is: "+list1);
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("html");
	list2.add("css");
	list2.add("python");
	list2.add("IoT");
	list2.add("c++");
	System.out.println("list 2 is: "+list2);
	
	ArrayList<String> list3 = new ArrayList<String>();
	list1.retainAll(list2);
	System.out.println("Common elements in both list are:"+list1);
	
	for(String ele:list1)
	{
		if(!list2.contains(ele))
		{
			list3.add(ele);
		}
	}
	for(String ele:list2)
	{
		if(!list1.contains(ele))
		{
			list3.add(ele);
		}
	}
	
	System.out.println(list3);
}
}
