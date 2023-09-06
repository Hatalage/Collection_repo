package com.labPrograms;

import java.util.Comparator;

public class Food {
private int foodid;
private String foodname;
private int foodprise;
public Food(int foodid, String foodname, int foodprise) {
	super();
	this.foodid = foodid;
	this.foodname = foodname;
	this.foodprise = foodprise;
}
public int getFoodid() {
	return foodid;
}
public void setFoodid(int foodid) {
	this.foodid = foodid;
}
public String getFoodname() {
	return foodname;
}
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public int getFoodprise() {
	return foodprise;
}
public void setFoodprise(int foodprise) {
	this.foodprise = foodprise;
}
@Override
public String toString() {
	return "Food [foodid=" + foodid + ", foodname=" + foodname + ", foodprise=" + foodprise + "]";
}
}
class FoodIdComparator implements Comparator<Food>
{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getFoodid()-o2.getFoodid();
	}
	
}
class foodNameComparator implements Comparator<Food>
{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.getFoodname().compareTo(o2.getFoodname());
	}
	
}

