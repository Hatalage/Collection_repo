package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to retain all elements from ArrayList
public class Example10 {
	public static void printstring()
	{
		ArrayList<String> laptop = new ArrayList<String>();
		laptop.add("Dell");
		laptop.add("HP");
		laptop.add("Asus");
		laptop.add("Lenovo");
		
		ArrayList<String> tech = new ArrayList<String>();
		tech.add("java");
		tech.add("python");
		tech.add("DS");
		tech.add("Cpp");
		tech.add("PHP");
		tech.add("ReactJS");
		
		laptop.retainAll(tech);
		System.out.println(tech);
	}
	public static void printinteger()
	{
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(45);
		age.add(22);
		age.add(30);
		age.add(18);
		age.add(22);
		age.add(31);
		
		
		ArrayList<Integer> price = new ArrayList<Integer>();
		price.add(45000);
		price.add(5000);
		price.add(55000);
		price.add(30000);
		
		
		
		price.retainAll(age);
		System.out.println(price);
		
	}
	public static void main(String[] args) {
		
		printstring();
		printinteger();
		
		

	}

}
