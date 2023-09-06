package com.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("ram");
	list.add("geeta");
	list.add("sam");
	list.add("duckie");
	list.add("peter");
	System.out.println(list);

	list.addFirst("john");
	System.out.println(list);
	
	list.addLast("luna");
	System.out.println(list);
	
	list.removeFirst();
	System.out.println("after removing first element");
	System.out.println(list);
	
	list.removeLast();
	System.out.println("After removing last element");
	System.out.println(list);
	
	System.out.println(list.get(0));
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
}
}
