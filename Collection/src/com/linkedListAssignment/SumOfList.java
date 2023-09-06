package com.linkedListAssignment;

import java.util.LinkedList;

public class SumOfList {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(123);
	list.add(12);
	list.add(10);
	 int sum=0;
	 for(int i=0; i<list.size(); i++)
	 {
		 int n = list.get(i);
		 while(n>0)
		 {
			 int digit = n%10;
			 sum = sum+digit;
			 n=n/10;
		 }
		 int s=0;
		 while(sum>0)
		 {
			 int digit1 = sum%10;
			 s = s+digit1;
			 sum=sum/10;
		 }
		 System.out.println(s);
		 
	 }
}
}
