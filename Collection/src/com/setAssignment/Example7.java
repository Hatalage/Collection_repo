package com.setAssignment;
//WAP to convert a HashSet to an array.

import java.util.HashSet;

public class Example7 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("shiv");
	set.add("ulka");
	set.add("swati");
	set.add("sharda");
	set.add("swara");
	System.out.println("HashSet is: "+set);
	
	System.out.println("Converting to array");
	Object[] strarr = set.toArray();
	System.out.println("-----Array----");
	for(Object s:strarr)
	{
		System.out.println(s);
	}
}
}
