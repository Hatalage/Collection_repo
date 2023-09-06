package com.comparableandComparator;

import java.util.Comparator;

public class Employee{

	private int empid;
	private String empname;
	private double empsal;
	private Department dept;
	
	public Employee(int empid, String empname, double empsal, Department dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", dept=" + dept + "]";
	}

}
class empIdComparator implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getEmpid()-o1.getEmpid();
	}
}
class empNameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpname().compareTo(o2.getEmpname());
	}
	
}
