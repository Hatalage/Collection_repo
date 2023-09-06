package com.labPrograms;

import java.util.Comparator;


	public class Employee implements Comparable<Employee>{
		
		private int empId;
		private String empName;
		private double empSalary;
		private Department dept;
		public Employee(int empId, String empName, double empSalary,Department dept) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
			this.dept=dept;
		}
		
		public int getEmpId() {
			return empId;
		}
		public Department getDept() {
			return dept;
		}
		public void setDept(Department dept) {
			this.dept = dept;
		}
		public String getEmpName() {
			return empName;
		}
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		
		@Override
		public String toString() {
			return "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", dept=" + dept;
		}
		@Override
		public int compareTo(Employee e) {
			return this.empId-e.empId;
		}

	}

	class EmployeeDeptId implements Comparator<Employee>
	{
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getDept().getDeptId()-o2.getDept().getDeptId();
		}
	}
	class EmployeeName implements Comparator<Employee>
	{
		
		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getEmpName().equals(o2.getEmpName())) {
			return (int)(o1.getEmpSalary()-o2.getEmpSalary());
			}
			else
			{
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
			}
		
	}
	class EmployeeDeptName implements Comparator<Employee>
	{
		
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getDept().getDeptName().compareTo(o2.getDept().getDeptName());
		}
		
	}

