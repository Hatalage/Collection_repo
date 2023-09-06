package com.demo.list;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	//non-generic collection
	 ArrayList list =new ArrayList(); //constructs an empty list with an initial capacity 10
	 //list before adding data
	 System.out.println(list);
	 
	 //add data in the list
	 list.add("shivani");
	 list.add(22);
	 list.add(45.55);
	 list.add(true);
	 list.add('D');
	 //list after adding data
	 System.out.println(list);
	 
	 //print list using for loop
	 System.out.println("------loop----");
	 for(int i=0;i<list.size();i++)
	 {
		 System.out.println(list.get(i));
	 }
	 //Task- display using for-each
	 System.out.println("-------For-each loop------");
	  for(Object obj:list)
	  {
		  System.out.println(obj);
	  }
	 
	 //non-generic collection
	 //no type safety
	 //whenever we fetch data using get() method in non-generic collection
	 //we will compile time error
	 
	 //type casting
	 //as we need to do here explicit type casting
	 //int i=list.get(1);
	 //Double d=list.get(2);
	 
	 Double d=(Double)list.get(2);
	 System.out.println("d:"+d);
}
}
