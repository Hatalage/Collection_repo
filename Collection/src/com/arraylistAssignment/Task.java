package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
static ArrayList<String> strList=new ArrayList<String>();
public static void addObjectToList()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string ");
	String s1=sc.next();
	strList.add(s1);
	System.out.println("String added successfully");
}
public static String getObjectFromList()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index:");
	int index=sc.nextInt();
	String obj=null;
	if(index>=0&&index<strList.size())
	{
		 obj=strList.get(index);
	}
	else
	{
		obj="OutOfIndex";
	}
	
	return obj;
}
public static void displayAllObjectsFromList()
{
	System.out.println("Objects in the ArrayList:");
	for(String obj:strList)
	{
		System.out.println(obj);
	}
}
public static void removeObjectUsingIndex()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index position to remove");
	int index=sc.nextInt();
	if(index>=0 && index<=strList.size())
	{
		strList.remove(index);
		System.out.println("Object removed from"+index);
	}
	else
	{
		System.out.println("Invalid index");
	}
}
public static void removeObjectUsingName()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to remove");
	String s2=sc.next();
	if(strList.contains(s2))
	{
		strList.remove(s2);
		System.out.println("object removed: "+s2);
	}
	else
	{
		System.out.println("Object not found!!!!!!");
	}
}
public static void updateObjectUsingIndex()
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the index position to update");
	int index=sc.nextInt();
	if(index>=0  && index<strList.size())
	{
		System.out.println("Enter the value to be added");
		String newStr=sc.next();
		strList.set(index, newStr);
		System.out.println("Object updated at index"+index);
	}
	else
	{
		System.out.println("Invalid index!!!!!!!!!");
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice;
	do {
		System.out.println("Menu is:");
		System.out.println("1. add object");
		System.out.println("2. get object");
		System.out.println("3. display object");
		System.out.println("4. remove object");
		System.out.println("5. remove object using name");
		System.out.println("6. update object");
		System.out.println("7. Exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: addObjectToList();
		break;
		case 2: String s=getObjectFromList();
		     	System.out.println(s);
		break;
		case 3: displayAllObjectsFromList();
		break;
		case 4: removeObjectUsingIndex();
		break;
		case 5: removeObjectUsingName();
		break;
		case 6: updateObjectUsingIndex();
		break;
		case 7: System.exit(0);
		}
	}
	while(true);
}
}
