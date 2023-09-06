package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	 Vector<Integer> list = new Vector<Integer>();
	 list.add(12);
	 list.addElement(22);
	 list.addElement(32);
	 list.addElement(42);
	 list.addElement(52);
	 
	 System.out.println(list);
	 //we can iterate over vector elements using:
	 //simple for loop
	 //for each loop
	 //iterator
	 //enumeration
	 
	 Enumeration<Integer> eitr=list.elements();
	 while(eitr.hasMoreElements())
	 {
		 System.out.println(eitr.nextElement());
	 }
}
}
