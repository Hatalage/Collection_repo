package com.labPrograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BookList {
	public static void main(String[] args) {
		LinkedList<Books> booklist = new LinkedList<Books>();	
		
		booklist.add(new Books(622,"wings of fire",400));
		booklist.add(new Books(924,"power of thinking",300));
		booklist.add(new Books(065,"think grow and rich",500));
		booklist.add(new Books(823,"astrology",300));
		booklist.add(new Books(234,"the last lecture",300));
		
		
		
		Iterator <Books> itr = booklist.iterator();
		System.out.println("\n------ Sorting Bookname by Comparable --------");
		itr = booklist.iterator();
		Collections.sort(booklist);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("\n------- Sorting BookId By Comparator -----------");
		Iterator <Books> itr1 = booklist.iterator();
		itr1 = booklist.iterator();
		
		Collections.sort(booklist,new BooksBookidComparator());
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		/////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n------------ Sorting BookName By Comparator -----------");
		Iterator <Books> itr2 = booklist.iterator();
		itr2 = booklist.iterator();
		
		Collections.sort(booklist,new BooksBookNameComparator());
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		int count=0;
		System.out.println("\n------------ same price of book -----------");
		System.out.println();
		for(int i=0;i<booklist.size();i++)
		{
			count=1;
			for(int j=0; j<booklist.size();j++)
			{
				if(booklist.get(i).getPrice()==booklist.get(j).getPrice())
				{
					count++;
				}
			}
		
		
		if(count>1)
		{
			System.out.println(booklist.get(i).getName());
			System.out.println(booklist.get(i).getPrice());
		}
		}
	}

}