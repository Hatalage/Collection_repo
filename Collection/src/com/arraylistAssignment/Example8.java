package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to remove element from ArrayList
public class Example8 {
	public static void removeElement()
	{
		ArrayList<Float> marks = new ArrayList<Float>();
		
		marks.add(345.8f);
		marks.add(876.0f);
		marks.add(57.9f);
		marks.add(79.7f);
		marks.add(90.3f);
		marks.add(89.4f);
		
		float f = marks.remove(2);
		System.out.println( f + " is removed");
		
		boolean f1 = marks.remove(79.7f);
		System.out.println(f1 );
		
		System.out.println(marks);
	
		
			
			//System.out.println(marks.remove(1) + " index is removed");
		
		
	}
	public static void main(String[] args) {
		removeElement();

	}

}

