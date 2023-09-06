package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to remove all elements from ArrayList
public class Example9 {
	public static void main(String[] args) {
		
		ArrayList<Float> marks = new ArrayList<Float>();
				
				marks.add(345.8f);
				marks.add(876.0f);
				marks.add(57.9f);
				marks.add(79.7f);
				marks.add(90.3f);
				marks.add(89.4f);
				
				boolean f = marks.removeAll(marks);
				System.out.println( f );
			
				
				System.out.println(marks);
			
					}

		}

