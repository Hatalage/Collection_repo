package com.demo.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask1 {
public static void main(String[] args) {
	ArrayList<String> namelist=new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("enter no of elements you wants to enter in list");
	int n=sc.nextInt();
	System.out.println("enter the names");
	for(int i=0;i<n;i++)
	{
		namelist.add(sc.next().toUpperCase());
	}
	System.out.println(namelist);
}
}
