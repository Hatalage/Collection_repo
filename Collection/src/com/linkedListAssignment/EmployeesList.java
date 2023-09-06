package com.linkedListAssignment;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeesList {
	private int id;
	String name;
	double salary;
	
	EmployeesList()
	{
		
	}
	

	public EmployeesList(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "EmployeesList [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//EmployeesList emp = new EmployeesList();
		LinkedList<EmployeesList> elist = new LinkedList<EmployeesList>();
		
		
		System.out.println("Enter no of employee");
		int noOfEmp = sc.nextInt();
		
		for(int i = 0; i < noOfEmp; i++) 
		{
			
			System.out.println("Enter employee ID");
			int id = sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("Enter employee Name");
			String name = sc.nextLine();
			
			System.out.println("Enter employee salary");
			double sal = sc.nextDouble();
			
			EmployeesList e = new EmployeesList(id,name,sal);
			 boolean flag = true;
			if(elist.size() == 0)
			{
				elist.add(new EmployeesList(id,name,sal));
			}
		
				for(int i1 = 0; i1 < elist.size(); i1++)
				{
					if(id < elist.get(i).getId())
					{
						elist.addFirst(new EmployeesList(id,name,sal));
						flag = false;
						break;
					}
					
				}
				if(flag)
				{
					elist.add(new EmployeesList(id,name,sal));
				}
				else
				{
					flag = false;
				}
			
			
		
		
			//elist.add(new EmployeesList(id,name,sal));
		
			for(EmployeesList e1 : elist)
			{
				System.out.println(e1);
			}
			
		}
		

	}


	
}

