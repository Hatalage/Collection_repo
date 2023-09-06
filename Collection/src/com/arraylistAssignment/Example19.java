package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to match two collections
public class Example19 {
	public static void main(String[] args) {
		ArrayList<Integer> price = new ArrayList<Integer>();
		price.add(45000);
		price.add(5000);
		price.add(55000);
		price.add(30000);
		
		System.out.println(price);
		
		ArrayList<Integer> price1 = new ArrayList<Integer>();
		price1.add(45000);
		price1.add(5000);
		price1.add(55000);
		price1.add(30000);

		System.out.println(price1);
		System.out.println(price.equals(price1));
	}

}
