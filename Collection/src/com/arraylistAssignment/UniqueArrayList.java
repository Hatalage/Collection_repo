package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueArrayList {
public static void main(String[] args) {
	ArrayList<Integer> list= new ArrayList<Integer>();
	list.add(12);
	list.add(2);
	list.add(10);
	list.add(12);
	list.add(11);
	list.add(10);
	list.add(2);
	
	System.out.println("Whole list including duplicates");
	System.out.println(list);
	
	System.out.println("List without duplicates");
	HashSet<Integer> set = new HashSet<Integer>(list);
	System.out.println(set);
}
}
