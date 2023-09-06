package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to use add operation of ArrayList
public class Example3 {
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

