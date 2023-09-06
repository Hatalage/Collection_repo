package com.comparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FoodArrayListMain {
public static void main(String[] args) {
	ArrayList<Food> flist=new ArrayList<Food>();
	flist.add(new Food(101, "tea",45));
	flist.add(new Food(102, "coffee",55));
	flist.add(new Food(103, "vada pav",15));
	flist.add(new Food(104, "biryani",155));
	flist.add(new Food(105, "gulabjamun",500));
	
	System.out.println("-----Food list----");
	System.out.println(flist);
	
	Iterator<Food> itr=flist.iterator();
	System.out.println("-----Foodlist sort by foodid----");
	Collections.sort(flist, new  FoodIdComparator());
	System.out.println("list after sorting");
	itr=flist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	Collections.sort(flist, new foodNameComparator());
	System.out.println("list after sorting names");
	itr=flist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
