package com.linkedListAssignment;

import java.util.LinkedList;

public class FirstOccurrenceNameRemove {
	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		name.add("swati");
		name.add("sharda");
		name.add("swati");
		name.add("shivani");
		name.add("ulka");
		name.add("nilam");
		name.add("ulka");
		
		System.out.println("name list----"+name);
		int count=0;
		for(int i=0;i<name.size();i++)
		{
			count=0;
			for(int j=i+1;j<name.size();j++)
			{
				if(name.get(i).equals(name.get(j)))
				{
					count++;
				}
			}
			if(count>=1)
			{
				name.removeFirstOccurrence(name.get(i));
			}
			
		}
		System.out.println(name);
	}

}

