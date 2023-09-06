package com.treeset;

import java.util.TreeSet;

import com.treemap.Customer;

public class TreeSetCustomer {
public static void main(String[] args) {
	TreeSet<Customer> set = new TreeSet<Customer>();
	
	Customer c1 = new Customer(301,"ram",22);
	Customer c2 = new Customer(201,"leena",18);
	Customer c3 = new Customer(501,"pooja",31);
	Customer c4 = new Customer(101,"abhi",45);
	Customer c5 = new Customer(100,"shiv",23);
	
	set.add(c1);
	set.add(c3);
	set.add(c5);
	set.add(c4);
	set.add(c2);
	
	for(Customer c:set)
	{
		System.out.println(c);
	}
	
}
}
