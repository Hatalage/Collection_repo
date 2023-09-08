package com.setAssignment;

import java.util.HashSet;

//1.WAP to create a HashSet with Integer objects without using generics
//2.WAP to create a HashSet with some colors (String) using generics
public class Example1and2 {
	public static void main(String[] args) {
		 HashSet set=new HashSet();
		 set.add(1);
		 set.add(2);
		 set.add(3);
		 set.add(4);
		 System.out.println(set);
		 HashSet<String> aset=new HashSet<String>();
		 aset.add("pink");
		 aset.add("Red");
		 aset.add("Blue");
		 aset.add("Black");
		 System.out.println(aset);
		 for(String s:aset)
		 {
			 System.out.println(s);
		 }

	}

}
