package com.labPrograms;

import java.util.LinkedList;

public class ListTask {
	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
		LinkedList<String> list2=new LinkedList<String>();
		
		list1.add("rakesh");
		list1.add("prasad");
		list1.add("swati");
		list1.add("pallavi");
		list1.add("ram");
		
		
		list2.add("pallavi");
		list2.add("prasad");
		list2.add("swati");
		
		
		
		for(String s:list1)
		{
			if(!list2.contains(s))
			{
				System.out.println(s);
			}
			
		}
	}

}

