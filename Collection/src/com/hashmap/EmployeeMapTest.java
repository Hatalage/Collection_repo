package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapTest {
public static void main(String[] args) {
	HashMap<Employee, String> emplist = new HashMap<Employee, String>();
	emplist.put(new Employee(1, "neha", 45000), "HR");
	emplist.put(new Employee(2, "siya", 55000), "SALES");
	emplist.put(new Employee(3, "sira", 65000), "MARKETING");
	emplist.put(new Employee(4, "riya", 75000), "HR");
	emplist.put(new Employee(5, "diu", 85000), "SALES");
	
	for(Map.Entry<Employee, String> m: emplist.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	HashMap<String, Integer> empmap = new HashMap<String, Integer>();
	int count;
	
}
}

