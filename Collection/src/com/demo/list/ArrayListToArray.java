package com.demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArray {
public static void main(String[] args) {
	ArrayList<String> namelist=new ArrayList<String>();
	namelist.add("radha");
	namelist.add("sourabh");
	namelist.add("priya");
	namelist.add("aman");
	namelist.add("bharat");
	int size=namelist.size();
	//case 1
	Object[] strarr =namelist.toArray();
	
	System.out.println("------Array------");
	for(Object s:strarr)
   {
	System.out.println(s);
}
	
	//case 2
	String arr1[]=new String[size];
	arr1=namelist.toArray(arr1);
	System.out.println("-------Array1-----");
	for(String s:arr1)
	{
		System.out.println(s);
	}
	
	//case 3
	System.out.println("-----Array2----");
	String newstr[]=new String[size];
	for(int i=0;i<size;i++)
	{
		newstr[i]=namelist.get(i);
	}
	
	for(String s:newstr)
	{
		System.out.println(s);
	}
	
	//Array to ArrayList
	
	String s1[]= {"rakesh", "shivani","suraj"};
	//case 1
	List<String> arlist = Arrays.asList(s1);
	System.out.println("------list-----");
	System.out.println(arlist);
	
	//case 2
	List<String> nlist=new ArrayList<String>();
	Collections.addAll(nlist, s1);
	System.out.println(nlist);
}
}
