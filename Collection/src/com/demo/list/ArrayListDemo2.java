package com.demo.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
public static void main(String[] args) {
	ArrayList<String> namelist=new ArrayList<String>();
	namelist.add("shivani");
	namelist.add("sourabh");
	namelist.add("sharda");
	namelist.add(null);
	namelist.add("prasad");
	namelist.add("sourabh");
	namelist.add(null);
	System.out.println(namelist);
	
	String s=namelist.get(0);
	System.out.println(s);
	//namelist.clear();      //it clears the list
	
	
	System.out.println("------by for loop----");
	//for-loop
	for(int i=0;i<namelist.size();i++)
	{
		System.out.println(namelist.get(i));
	}
	
	//for-each loop
	System.out.println("-------by for each loop------");
	for(String s1:namelist)
	{
		System.out.println(s1);
	}
}
}
