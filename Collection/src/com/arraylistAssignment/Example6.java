package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to iterate through all elements in an ArrayList using for each
public class Example6 {
	public static void main(String[] args) {
		ArrayList<String> language = new ArrayList<String>();
		
		language.add("Java");
		language.add("Python");
		language.add("PHP");
		language.add(".NET");
		language.add("JavaScript");
		language.add("SQL");
		language.add("ReactJS");
		
		
		System.out.print("[");
		for(String o : language)
		{
			System.out.print(o + " ,");
		}
		System.out.println("]");
		
		
		

	}

}
