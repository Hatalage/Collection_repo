package com.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<Integer> tset=new TreeSet<Integer>();
	tset.add(45);
	tset.add(56);
	tset.add(36);
	tset.add(92);
	tset.add(23);
	tset.add(12);
	
	System.out.println(tset);
	System.out.println("First element is: "+tset.first());
	System.out.println("Last element is: "+tset.last());
	System.out.println("higher than 45 is: "+tset.higher(40));  //higher than given value
	System.out.println("lower than 45 is: "+tset.lower(40));    //lower than given value
	System.out.println("floor of 45 is: "+tset.floor(45));   //equal or lower
	System.out.println("ceil of 45 is: "+tset.ceiling(40));  //equal or higher
	System.out.println("Pollfirst is  "+tset.pollFirst());
	System.out.println("Polllast is  "+tset.pollLast());
	System.out.println(tset.descendingSet());
	
	System.out.println("subset : "+tset.subSet(10, 50));
	System.out.println("headset(56)"+tset.headSet(56));
	System.out.println("tailset(56)"+tset.tailSet(56));
}
}
