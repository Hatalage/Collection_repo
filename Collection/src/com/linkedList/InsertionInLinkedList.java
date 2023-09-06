package com.linkedList;

import java.util.LinkedList;

public class InsertionInLinkedList {
public static void main(String[] args) {
	LinkedList<String> namelist=new LinkedList<String>();
	namelist.addFirst("devansh");
	namelist.offerFirst("sejal");
	System.out.println(namelist);
	
	namelist.add(2, "leena");
	System.out.println(namelist);
	
	namelist.add("priya");
	System.out.println(namelist);
	
	namelist.addLast("bina");
	System.out.println(namelist);
	namelist.offer("jina");
	System.out.println(namelist);
	namelist.offerLast("kavita");
	System.out.println(namelist);
}
}
