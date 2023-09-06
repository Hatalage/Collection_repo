package com.treemap;

public class City implements Comparable<City>{
private int pincode;
private String name;
public City(int pincode, String name) {
	super();
	this.pincode = pincode;
	this.name = name;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "City [pincode=" + pincode + ", name=" + name + "]";
}
@Override
public int compareTo(City o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());
}

}
