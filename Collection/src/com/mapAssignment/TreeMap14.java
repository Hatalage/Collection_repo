package com.mapAssignment;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//WAP to create a TreeMap to store the Employee objects in a descending order based on 
//Employee Id
class Employee
{
	String name;
	int id;
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
}
class AccordingId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	
}
public class TreeMap14 {
public static void main(String[] args) {
	TreeMap<Employee,Integer> map = new TreeMap<Employee,Integer>();
	map.put(new Employee("John",101),1);
	map.put(new Employee("Sam",104),1);
	map.put(new Employee("Maria",103),1);
	map.put(new Employee("Alice",102),1);
	
	for (Map.Entry<Employee, Integer> entry : map.entrySet()) {
        System.out.println("Key : (" + entry.getKey().name + ": " + entry.getKey().id + "), Value : " + entry.getValue());
    }
}
}
