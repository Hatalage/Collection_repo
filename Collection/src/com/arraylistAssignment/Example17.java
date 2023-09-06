package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to insert an element into the ArrayList at the first position
public class Example17 {
public static void main(String args[])
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Orange");
	list.add("Mango");
	list.add("banana");
	System.out.println(list);
    list.set(1, "Papaya");
	System.out.println("list after inserting element into first position");
	System.out.println(list);
	
}
}
