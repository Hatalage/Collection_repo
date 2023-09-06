package com.labPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {
	
		
		public static void main(String[] args) {
			
			Department d1=new Department(123, "IT");
			Department d2=new Department(124, "SALES");
			Department d3=new Department(122, "HR");
			
			ArrayList<Employee> emplist= new ArrayList<Employee>();
			
			emplist.add(new Employee(101, "neha",25000,new Department(125, "Production")));
			emplist.add(new Employee (103, "ram", 15000, d1));
			emplist.add(new Employee (102, "mira", 35000, d2));
			emplist.add(new Employee (104, "pooja", 5000, d3));
			emplist.add(new Employee (106, "leena", 45000, d1));
			emplist.add(new Employee (105, "mira", 55000, d3));
			emplist.add(new Employee (107, "pooja", 15000, d1));
			emplist.add(new Employee (108, "pooja", 2000, d1));
			
			System.out.println("---------Before Sorting---------");
			Iterator<Employee> itr = emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
			System.out.println("---------After Sorting---------");
			Collections.sort(emplist);
			itr = emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("---------Same names with salary Sorting---------");		
			Collections.sort(emplist,new EmployeeName());
			itr = emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("---------Same names with salary Order Sorting---------");		
			Collections.sort(emplist,new EmployeeName());
			itr = emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("---------Same names with Department name Sorting---------");		
			Collections.sort(emplist,new EmployeeDeptName());
			itr = emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("---------Same names with Department Id Sorting---------");		
			Collections.sort(emplist,new EmployeeDeptId());
			itr = emplist.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}

	}

