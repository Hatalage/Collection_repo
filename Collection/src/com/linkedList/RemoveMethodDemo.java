package com.linkedList;

import java.util.LinkedList;

public class RemoveMethodDemo {
public static void main(String[] args) {
	LinkedList<String> namelist=new LinkedList<String>();
	
	namelist.add("deva");
	namelist.add("simmi");
	namelist.add("julie");
	namelist.add("vansh");
	namelist.add("ansh");
	
	System.out.println(namelist.remove());
	System.out.println(namelist);
	namelist.removeFirst();
	System.out.println(namelist);
	namelist.poll();
	System.out.println(namelist);
	namelist.pollFirst();
	System.out.println(namelist);
}
}
