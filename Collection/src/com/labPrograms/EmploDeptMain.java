package com.labPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class EmploDeptMain {
public static void main(String[] args) {
	Department1 d1=new Department1("MARKTING");
	Department1 d2=new Department1("SALES");
	Department1 d3=new Department1("HR");
	
	ArrayList<Employee1> emlist = new ArrayList<Employee1>();
	emlist.add(new Employee1(1, "john",d2));
	emlist.add(new Employee1(2, "maria",d1));
	emlist.add(new Employee1(3, "alex",d3));
	emlist.add(new Employee1(4, "sonu",d1));
	emlist.add(new Employee1(5, "monu",d2));
	
	System.out.println("Before sorting");
	System.out.println(emlist);
	
	System.out.println("\nAfter sorting");
	Iterator<Employee1> itr= emlist.iterator();
	
	Collections.sort(emlist, new Employee1DeptComparator());
	itr= emlist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	
	
}
}
