package com.linkedList;

import java.util.LinkedList;

public class RetriveMethodDemo {
	public static void main(String[] args) {
		LinkedList<String> namelist=new LinkedList<String>();
		
		namelist.add("deva");
		namelist.add("simmi");
		namelist.add("julie");
		namelist.add("vansh");
		namelist.add("ansh");
		
		//retrive from head
		System.out.println(namelist.getFirst());
		System.out.println(namelist.peek());
		System.out.println(namelist.peekFirst());
		
		//retrive from middle
		System.out.println(namelist.get(2));
		
		//retrive from last
		System.out.println(namelist.getLast());
		System.out.println(namelist.peekLast());
		
}
}