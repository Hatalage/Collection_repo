package com.arraylistAssignment;

import java.util.ArrayList;

//WAP to iterate through all elements in an ArrayList using for loop
public class Example5 {
	public static void main(String[] args) {
		ArrayList<String> colorlist = new ArrayList<String>();
				
				colorlist.add("black");
				colorlist.add("grey");
				colorlist.add("purple");
				colorlist.add("red");
				colorlist.add("white");
				colorlist.add("blue");
				colorlist.add("orange");
				
				
				
				for(int i = 0; i < colorlist.size(); i++)
				{
					System.out.println(colorlist.get(i)); 
				}
				
				
				int s = colorlist.indexOf("white");
				System.out.println(s);
				
				
				 

			}

		}

