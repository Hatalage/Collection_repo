package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Iterator;

//WAP to print all elements of ArrayList using iterator
public class Example4 {
public static void main(String[] args) {
	ArrayList<String>colorlist=new ArrayList<String>();
	colorlist.add("red");
	colorlist.add("yellow");
	colorlist.add("blue");
	colorlist.add("orange");
	colorlist.add("white");
	Iterator<String>itr=colorlist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
