package com.comparableandComparator;

import java.util.Comparator;

public class Department {
private int deptid;
private String deptname;
public Department()
{
	super();
}
public Department(int deptid,String deptname)
{
	super();
	this.deptid=deptid;
	this.deptname=deptname;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
@Override
public String toString() {
	return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
}


}
class deptIdComparator implements Comparator<Department>{


	@Override
	public int compare(Department o1, Department o2) {
		// TODO Auto-generated method stub
		return o1.getDeptid()-o2.getDeptid();
	}
}	

