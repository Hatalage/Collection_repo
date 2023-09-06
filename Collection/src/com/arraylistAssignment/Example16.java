package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to retrieve an element (at a specified index) from a given ArrayList
public class Example16 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Rose");
	list.add("Lotus");
	list.add("JAsmine");
	list.add("NightQueen");
	System.out.println(list);
	System.out.println("Element at specified index is: ");
	System.out.println(list.get(3));
}
}
