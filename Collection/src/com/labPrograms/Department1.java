package com.labPrograms;

public class Department1 {
private String deptName;

public Department1(String deptName) {
	
	this.deptName = deptName;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

@Override
public String toString() {
	return "Department1 [deptName=" + deptName + "]";
}

}
