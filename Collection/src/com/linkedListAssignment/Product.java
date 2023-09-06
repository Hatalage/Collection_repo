package com.linkedListAssignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class Product {
private int id;
private String name;
private double price;
public Product(int id, String name, double price)
{
	this.id=id;
	this.name=name;
	this.price=price;
}
public static void main(String[] args) {
	LinkedList<Product> plist = new LinkedList<Product>();
	plist.add(new Product(1, "kitkat",500));
	plist.add(new Product(2, "DairyMilk",200));
	plist.add(new Product(3, "FiveStar",50));
	plist.add(new Product(4, "Munch",100));
	
	ListIterator<Product> iterator = plist.listIterator();
	while(iterator.hasNext())
	{
		Product p = iterator.next();
		System.out.println("Product id is: "+p.id);
		System.out.println("Product name is: "+p.name);
		System.out.println("Product price is: "+p.price);
		
	}
	
	
}

}
