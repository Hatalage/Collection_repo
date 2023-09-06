package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to create a new ArrayList, add some colors (string) and print the collection.
public class Example7 {
	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
		
		colorlist.add("red");
		colorlist.add("white");
		colorlist.add("purple");
		colorlist.add("yellow");
		colorlist.add("orange");
		colorlist.add("green");
		
		System.out.println(colorlist);

	}

}

