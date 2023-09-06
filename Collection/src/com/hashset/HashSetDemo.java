package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<Integer>();
	set.add(45);
	set.add(25);
	set.add(36);
	set.add(55);
	set.add(36);  //if duplicate is there displays only one
	//only one null key is allowed if more than one null is there 
	//diplays only once
	 System.out.println(set);
	 System.out.println("------Using for each loop------");
	 for(int s:set)
	 {
		 System.out.println(s);
	 }
	 
	 
	 System.out.println("------Using Iterator------");
	 Iterator<Integer> itr = set.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
	 System.out.println("------Using for loop----");
	 ArrayList<Integer> aset = new ArrayList<Integer>(set);
	 for(int i=0;i<aset.size();i++)
	 {
		 System.out.println(aset.get(i));
	 }
	 
}
}
