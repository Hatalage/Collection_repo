package com.demo.list;

import java.util.ArrayList;

public class ArraylistRetainAll {
	public static void main(String[] args) {
			ArrayList<String> schoolbag = new ArrayList<String>();
			schoolbag.add("book");
			schoolbag.add("pen");
			schoolbag.add("pencil");
			schoolbag.add("notebook");
			schoolbag.add("eraser");
			
			
			
			ArrayList<String> tutionbag = new ArrayList<String>();
			tutionbag.add("book");
			tutionbag.add("Laptop");
			tutionbag.add("pencil");
			tutionbag.add("umberlla");
			tutionbag.add("eraser");
			
			System.out.println("schoolbag : " + schoolbag);
			System.out.println("tutionbag : " + tutionbag);
			
			tutionbag.retainAll(schoolbag); //change schoolbag object
											// print common element in schoolbag and tutionbag
			
			System.out.println("schoolbag : " + schoolbag);
			System.out.println("tutionbag: " + tutionbag);

		}
}

