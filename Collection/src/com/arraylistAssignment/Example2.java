package com.arraylistAssignment;

import java.util.ArrayList;

//WAP add elements to arraylist without using generics,
//0th location keep Integer, 1st location String now print each element and display contents.
public class Example2 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(22);
	list.add("shivani");
	System.out.println("------Using for loop-------");
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	System.out.println("-------Using for-each loop-------");
	for(Object d:list)
	{
		System.out.println(d);
	}
}
}
