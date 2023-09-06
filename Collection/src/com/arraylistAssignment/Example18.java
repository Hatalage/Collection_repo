package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Iterator;
//WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
public class Example18 {
public static void main(String[] args) {
	ArrayList <Integer> list = new ArrayList<Integer>();
	for(int i=2;i<50; i++)
	{
		list.add(i);
	}
	System.out.println("List after adding elements");
	System.out.println(list);
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext())
	{
		int a=itr.next();
		if(a%2==0)
		{
			System.out.print(a+" ");
		}
	}
	
}
}
