package com.demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayDemo {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>(2);
	list.add(12);
	list.add(12);
	list.add(12);
	list.add(12);
	System.out.println(list);
	
    Object arr[] = list.toArray();
	for(Object e: arr)
	{
		System.out.println(e);
	}
	String s[] = {"shiv","ram"};
	
	List<String> arlist = Arrays.asList(s);
	System.out.println(arlist);
}
}
