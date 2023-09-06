package com.arraylistAssignment;
//WAP to replace the second element of an ArrayList with the specified element

import java.util.ArrayList;
import java.util.Collections;

public class Example23 {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Rose");
	list.add("Lotus");
	list.add("Jasmine");
	list.add("lily");
	list.add("NightQueen");
	System.out.println("Before replacing list is: ");
	System.out.println(list);
	System.out.println("After replacing list is: ");
	list.set(1, "SunFlower");
	System.out.println(list);
}
}