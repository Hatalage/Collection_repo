package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//WAP to convert collection into array
public class Example21 {
	public static void main(String[] args) {
		ArrayList<String> namelist=new ArrayList<String>();
		namelist.add("radha");
		namelist.add("sourabh");
		namelist.add("priya");
		namelist.add("aman");
		namelist.add("bharat");
		int size=namelist.size();
		//ArrayList to Array
		Object strarr[] =namelist.toArray();
		
		System.out.println("------Array------");
		for(Object s:strarr)
	   {
		System.out.println(s);
	}
		
		
		//Array to ArrayList
		String s1[]= {"radha", "sourabh","priya","aman","bharat"};
		//case 1
		List<String> arlist = Arrays.asList(s1);
		System.out.println("------list-----");
		System.out.println(arlist);
		
		
	}
}
