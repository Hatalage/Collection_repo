package com.labPrograms;

import java.util.Comparator;

public class Employee1{
private int empId;
private String empName;
private Department1 dept;
public Employee1(int empId, String empName,Department1 dept)
{
	this.empId=empId;
	this.empName=empName;
	this.dept = dept;
}
public void setEmpId(int empId)
{
	this.empId=empId;
}
public void setEmpName(String empName)
{
	this.empName=empName;
}
public void setDept(Department1 dept)
{
	this.dept=dept;
}
public int getEmpId()
{
	return empId;
}
public String getEmpName()
{
	return empName;
}
public Department1 getDept()
{
	return dept;
}
@Override
public String toString() {
	return "Employee1 [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
}

}
class Employee1DeptComparator implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getDept().getDeptName().compareTo(o2.getDept().getDeptName());
	}
	
}
