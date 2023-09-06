package com.labPrograms;

import java.util.ArrayList;

public class Task {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("rose");
	list1.add("jasmine");
	list1.add("lotus");
	System.out.println("List1 is: ");
	System.out.println(list1);
	ArrayList<String> list2=new ArrayList<String>();
	list2.add("lily");
	list2.add("Sunflower");
	list2.add("cherry");
	System.out.println("List2 is: ");
	System.out.println(list2);
	
	System.out.println("Joined list is: ");
	list1.addAll(list2);
	System.out.println(list1);
}
}
