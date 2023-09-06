package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to empty ArrayList
public class Example13 {
	public static void main(String[] args) {
		ArrayList<Double> bookprice = new ArrayList<Double> ();
		System.out.println("isEmpty : " + bookprice.isEmpty());
		
		bookprice.add(345.6);
		bookprice.add(793.9);
		bookprice.add(342.5);
		bookprice.add(096.5);
		bookprice.add(916.4);
		bookprice.add(682.8);
		bookprice.add(852.4);
		bookprice.add(922.7);
		
		System.out.println(bookprice);
		System.out.println("isEmpty : " + bookprice.isEmpty());
		
		bookprice.clear();
		System.out.println(bookprice);
		
	}

}
