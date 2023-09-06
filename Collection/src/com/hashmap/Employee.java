package com.hashmap;

import java.util.Objects;

public class Employee {
private int eid;
private String ename;
private double esalary;
public Employee(int eid, String ename, double esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
public int hashCode()
{
	return Objects.hash(eid,ename);
}
public boolean equals(Object other)
{
	//if the memeory referrences are equal,
	//then the objects are same hence return true
	if(this==other)
	
		return true;
	//if the second object is null, 
	//but the first object is not null return false
	if(other==null)
	
		return false;
	//if the class type of these two objects are not equal return false
	if(getClass()!=other.getClass())
	
		return false;
	//type cast object to employee
	Employee obj = (Employee) other;
	//comparing with eid
	if(this.eid==obj.eid && this.ename.equals(obj.ename)) 
		return true;
		
	
	return false;

}
}
