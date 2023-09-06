package com.comparableandComparator;

public class Student implements Comparable<Student>{
private int id;
private String name;
private int marks;
public Student(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}
public void show()
{
	System.out.println(id+" "+name+" "+marks);
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
//	if(this.id==o.id)                   //for sorting id of student
//	{
//		return 0;
//	}
//	else if(this.id<o.id)
//	{
//		return -1;
//	}
//	else
//	{
//		return 1;
//	}
	return this.id-o.id;
	//return this.name.compareTo(o.name);    //for sorting names of student
}


}
