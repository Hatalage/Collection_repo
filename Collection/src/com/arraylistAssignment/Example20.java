package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to check if collection is empty
public class Example20 {
public static void main(String[] args) {
	ArrayList<String> namelist=new ArrayList<String>();
	System.out.println("Before inserting elements:");
	System.out.println("isEmpty(): "+namelist.isEmpty());
	namelist.add("shiv");
	namelist.add("sourabh");
	namelist.add("sharda");
	namelist.add(null);
	namelist.add("prasad");
	namelist.add("sourabh");
	namelist.add(null);
	System.out.println("After inserting element:");
	System.out.println("isEmpty():"+namelist.isEmpty());
	
}
}
