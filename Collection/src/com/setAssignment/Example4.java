package com.setAssignment;

import java.util.HashSet;
import java.util.Iterator;

//WAP to iterate through all elements in a HashSet and print the elements. 
//Observe the order of elements.

public class Example4 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("shiv");
	set.add("ulka");
	set.add("swati");
	set.add("sharda");
	set.add("swara");
	Iterator<String> itr = set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
