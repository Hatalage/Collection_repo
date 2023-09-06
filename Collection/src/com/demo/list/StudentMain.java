package com.demo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {
public static void main(String[] args) {
	ArrayList<Student> slist=new ArrayList<Student>();
	slist.add(new Student(101, "rahul",45));
	slist.add(new Student(102, "sham",55));
	slist.add(new Student(103, "neha",65));
	slist.add(new Student(104, "kavita",75));
	slist.add(new Student(105, "raman",85));
	
	System.out.println("-----Student list----");
	System.out.println(slist);
	
	System.out.println("---Student list with toString()---");
	for(int i=0;i<slist.size();i++)
	{
		System.out.println(slist.get(i));
	}
	
	System.out.println("-----student list without toString using method---");
	for(int i=0;i<slist.size();i++)
	{
		Student s=slist.get(i);
		s.show();
	}
	
	System.out.println("-----Student list without toString() using getters setters----");
	for(int i=0;i<slist.size();i++)
	{
		Student s=slist.get(i);
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
	}
	
	//for-each
	System.out.println("-----Student list with for-each loop-----");
	for(Student s:slist)
	{
		System.out.println(s);
	}
	
	System.out.println("----Student list with Iterator----");
	Iterator<Student> itr=slist.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//WAC to check whether any student is present or not
	System.out.println("----To check Student----");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name want to check:");
		String name = sc.next();
		for(int i=0;i<slist.size();i++)
		{
			Student s= slist.get(i);
			if(s.getName()=="kavita")
			{
			if(s.getName().equals(name))
			{
			System.out.println(name+" is present in list");
			break;
			}
			else
			{
			System.out.println(name+" is not present in list");
			break;
			}
		}
		}
		//WAC to check whose id greater than 101
		System.out.println("Student id greater than 101");
		for(int i=0;i<slist.size();i++)
		{
			Student s=slist.get(i);
			if(s.getId()>101)
			{
				System.out.println(s);
			}
		}
}
	
	}
