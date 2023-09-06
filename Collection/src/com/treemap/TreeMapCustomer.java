package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCustomer {
	public static void main(String[] args) {
		TreeMap<Customer,City> map = new TreeMap<Customer,City>();
		
		Customer c1 = new Customer(301,"ram",22);
		Customer c2 = new Customer(201,"leena",18);
		Customer c3 = new Customer(501,"pooja",31);
		Customer c4 = new Customer(101,"abhi",45);
		Customer c5 = new Customer(100,"shiv",23);
		
		City t1 = new City(425036,"pune");
		City t2 = new City(425114,"jalgoan");
		City t3 = new City(425236,"nashik");
		City t4 = new City(425612,"nagpur");
		City t5 = new City(425036,"aurangabad");
		
		map.put(c1, t1);
		map.put(c2, t2);
		map.put(c3, t3);
		map.put(c4, t4);
		map.put(c5, t5);

		for(Map.Entry<Customer,City> m : map.entrySet())
		{
			System.out.println(m.getKey() + "    " + m.getValue());
		}
		
		
		
	}

}

