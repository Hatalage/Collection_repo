package com.demo.list;

import java.util.ArrayList;

public class ArrayListRemove {

		public static void main(String[] args) {
			ArrayList<String> colorlist = new ArrayList<String>();
			colorlist.add("red");
			colorlist.add("blue");
			colorlist.add("white");
			colorlist.add("orange");
			colorlist.add("black");
			
			System.out.println(colorlist);
			
			String s = colorlist.remove(0); // throw IndexOutOfBoundsexception if index is not present
			System.out.println("Remove object at index 0 : " + s);
			

			boolean b = colorlist.remove("skyblue"); //return false if object is not present
			System.out.println(b);
			System.out.println(colorlist);
		}

	}

