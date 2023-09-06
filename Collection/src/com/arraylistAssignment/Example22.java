package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;

//WAP of swap two elements in an ArrayList
public class Example22 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Rose");
	list.add("Lotus");
	list.add("Jasmine");
	list.add("lily");
	list.add("NightQueen");
	System.out.println("Before swaping list is: ");
	System.out.println(list);
	System.out.println("After swaping list is: ");
	Collections.swap(list, 0, 3);
	System.out.println(list);
}
}
