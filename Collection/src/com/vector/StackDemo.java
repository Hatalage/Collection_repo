package com.vector;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> slist=new Stack<Integer>();
	slist.push(10);
	slist.push(56);
	slist.push(15);
	System.out.println(slist);
	System.out.println("Top of the stack: "+slist.peek());
	
	System.out.println("pop()-> "+slist.pop());
	System.out.println(slist);
	System.out.println("Top of the stack: "+slist.peek());
	
	
	//search
	//this method gives the position(index) of the element according to stack insertion
	slist.push(23);
	System.out.println(slist);
	System.out.println(slist.search(56));
	System.out.println(slist.empty());
}
}
