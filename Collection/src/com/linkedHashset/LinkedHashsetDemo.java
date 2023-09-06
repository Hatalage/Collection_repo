package com.linkedHashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
public static void main(String[] args) {
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	set.add("neha");
	set.add("pooja");
	set.add("yami");
	set.add("neha");
	set.add(null);
	System.out.println(set);
	
	System.out.println("------Using for each loop-----");
	for(String s: set)
	{
		System.out.println(s);
	}
	
	System.out.println("---------Using ArrayList--------");
	ArrayList<String> aset = new ArrayList<String>(set);
	for(int i=0;i<aset.size();i++)
	 {
		 System.out.println(aset.get(i));
	 }
}
}
