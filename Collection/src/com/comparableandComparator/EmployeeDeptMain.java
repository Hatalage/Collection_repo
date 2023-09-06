package com.comparableandComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeDeptMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department(111,"IT");
		Department d2=new Department(112,"SALES");
		Department d3=new Department(113,"HR");
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		ArrayList<Department> deptlist=new ArrayList<Department>();
		
		emplist.add(new Employee(102,"neha",25000,new Department(114,"PRODUCTION")));
		emplist.add(new Employee(103,"ram",15000,d1));
		emplist.add(new Employee(101,"mira",35000,d2));
		emplist.add(new Employee(104,"pooja",25000,d3));
		emplist.add(new Employee(106,"leena",45000,d1));
		emplist.add(new Employee(105,"mira",55000,d3));
		emplist.add(new Employee(107,"pooja",15000,d1));
		emplist.add(new Employee(108,"mira",15000,d2));
		System.out.println("----------Employee List---------");
		Iterator<Employee> eitr=emplist.iterator();
		while(eitr.hasNext()) {
			System.out.println(eitr.next());
		}
		
		System.out.println("----------Department List---------");
		Iterator<Department> ditr = deptlist.iterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		
		
		System.out.println("----------after sorting Employee List in descending order---------");
		Collections.sort(emplist, new empIdComparator());
		eitr=emplist.iterator();
		
		while(eitr.hasNext()) {
			System.out.println(eitr.next());
		}
		System.out.println("----------after sorting Department List---------");
		Collections.sort(deptlist, new deptIdComparator());
		ditr=deptlist.iterator();
		
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}
		
		
		System.out.println("----same names with salary order sorting-----");
		Collections.sort(emplist, new empNameComparator());
		eitr=emplist.iterator();
		while(eitr.hasNext())
		{
			System.out.println(eitr.next());
		}
	}

}

