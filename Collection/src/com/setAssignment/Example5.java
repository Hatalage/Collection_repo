package com.setAssignment;

import java.util.HashSet;

//WAP to get the number of elements in a HashSet.
//WAP to empty a HashSet
public class Example5 {
public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("shiv");
	set.add("ulka");
	set.add("swati");
	set.add("sharda");
	set.add("swara");
	System.out.println("Number of elements in the hashset is: "+set.size());
	set.clear();
}
}
