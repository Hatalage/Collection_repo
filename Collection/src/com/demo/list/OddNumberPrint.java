package com.demo.list;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumberPrint {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    
    int count=0;
    while(count<n)
    {
    	for(int i=1;count<n;i++)
    	{
    		if(i%2!=0)
    		{
    			list.add(i);
    			count++;
    		}
    	}
    }
    System.out.println(list);
}
}
