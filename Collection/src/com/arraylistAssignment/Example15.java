package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Scanner;

//WAP to search the specified collection in this collection
public class Example15 {
	public static void main(String[] args) {
		ArrayList<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("cherry");
        collection.add("date");
        collection.add("elderberry");

       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search for: ");
        String searchElement = scanner.nextLine();

        
        if (collection.contains(searchElement)) {
            System.out.println(searchElement + " found in the collection.");
        } else {
            System.out.println(searchElement + " not found in the collection.");
        }
	}
}
