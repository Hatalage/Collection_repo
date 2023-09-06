package com.arraylistAssignment;

import java.util.ArrayList;
import java.util.Scanner;

//WAP to search an element from ArrayList
public class Example14 {
	public static void main(String[] args) {
		ArrayList<Character> ch = new ArrayList<Character> ();
		Scanner sc = new Scanner(System.in);
		
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('D');
		ch.add('E');
		ch.add('F');
		ch.add('E');
		
		System.out.println(ch);
		System.out.println(ch.contains('V'));
		
		int x = ch.indexOf('A');
		System.out.println(x);
		
		int y = ch.lastIndexOf('E');
		System.out.println(y);
			
		}

}
