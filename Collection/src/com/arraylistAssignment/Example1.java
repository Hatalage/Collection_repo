package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to add elements to arraylist without using generics (no <>)
//and print content of it where Integer is used. In second arraylist String is used.
public class Example1 {
public static void main(String[] args) {
	ArrayList list1=new ArrayList();
	list1.add(12);
	list1.add(23);
	list1.add(44);
	list1.add(55);
	list1.add(50);
	System.out.println(list1);
	//simple for
	for(int i=0;i<list1.size();i++)
	{
		System.out.println(list1.get(i));
	}
	//for-each loop
	for(Object n:list1)
	{
		System.out.println(n);
	}
	
	ArrayList list2=new ArrayList();
	list2.add("shiv");
	list2.add("ram");
	list2.add("sam");
	list2.add("sharda");
	list2.add("shiv");
	System.out.println(list2);
}
}
