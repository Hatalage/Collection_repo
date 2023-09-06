package com.linkedListAssignment;

import java.util.LinkedList;

public class HighestLowestFromList {
public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(12);
	list.add(3);
	list.add(4);
	list.add(8);
	list.add(11);
	list.add(10);
	list.add(7);
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	for(int num: list)
	{
		if(num>max)
		{
			max=num;
		}
		if(num<min)
		{
			min=num;
		}
	}
	System.out.println("Highest number from list is: "+max);
	System.out.println("Lowest number from list is: "+min);
}
}
