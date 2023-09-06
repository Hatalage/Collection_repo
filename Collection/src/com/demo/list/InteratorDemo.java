package com.demo.list;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorDemo {
public static void main(String[] args) {
	ArrayList<String>colorlist=new ArrayList<String>();
	colorlist.add("red");
	colorlist.add("yellow");
	colorlist.add("blue");
	colorlist.add(null);
	colorlist.add("white");
	
	//to retrieve elements one by one
	//read and remove element
	Iterator<String>itr=colorlist.iterator();
	
	//hasNext()->return true of the iteration has more elements
	//next()-> return the next element in the iteration
	//it throws NoSuchElementException if no more element is present
	
//	System.out.println(itr.hasNext());  //true
//	System.out.println(itr.next());    //red
//	System.out.println(itr.hasNext());  
//	System.out.println(itr.next());  
//	System.out.println(itr.hasNext());  
//	System.out.println(itr.next());    
//	System.out.println(itr.hasNext());  
//	System.out.println(itr.next());    
//	System.out.println(itr.hasNext());  
//	System.out.println(itr.next());    
//	System.out.println(itr.hasNext());  //false
//	System.out.println(itr.next());  //NoSuchElementException  
	
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}

