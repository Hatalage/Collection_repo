package com.linkedList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratordemo {
public static void main(String[] args) {
	ArrayList<String>colorlist=new ArrayList<String>();
	colorlist.add("red");
	colorlist.add("blue");
	colorlist.add("yellow");
	colorlist.add(null);
	colorlist.add("while");
	
	//it is only applicable for list collection
	//bi-directional
	System.out.println("------forward-----");
	ListIterator<String> listitr=colorlist.listIterator();
	while(listitr.hasNext())
	{
		System.out.println(listitr.next());
	}
	
	System.out.println("-------backward-----");
	while(listitr.hasPrevious())
	{
		System.out.println(listitr.previous());
	}
}
}
