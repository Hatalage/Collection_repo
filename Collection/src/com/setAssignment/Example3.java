package com.setAssignment;

import java.util.ArrayList;
import java.util.HashSet;

//WAP to create a HashSet from an ArrayList
public class Example3 {
public static void main(String[] args) {
	HashSet<Integer>set=new HashSet<Integer>();
	set.add(12);
	set.add(02);
	set.add(45);
	set.add(55);
	set.add(73);
	System.out.println("HashSet is :"+set);
	
	System.out.println("Creating HashSet from ArrayList");
	ArrayList<Integer> list=new ArrayList<Integer>(set);
	System.out.println("List is"+list);
}
}
