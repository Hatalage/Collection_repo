package com.linkedListAssignment;

import java.util.LinkedList;
import java.util.Scanner;

public class AlternateWordPrinting {
	public static void main(String[] args) {
		LinkedList<String> list = new  LinkedList<String>();
		
		list.add("I love java programming");
		list.add("Hello EveryBody");
		
		System.out.println(list);
		
		LinkedList<String> alternatelist = new  LinkedList<String>();
		for(String s : list)
		{
			String[] words = s.split(" ");
			for(int i = 0; i < words.length; i++)
			{
				if(i%2==0)
				{
				alternatelist.add(words[i]);
			}
		}
		}
		
		System.out.println("\n------- Alternate List ----------");
		for(String str : alternatelist)
		{
			System.out.println(str);
		}
		

	}

}

