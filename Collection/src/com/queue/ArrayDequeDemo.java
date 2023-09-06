package com.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
public static void main(String[] args) {
	ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
	dq.add(35);
	dq.add(12);
	dq.add(3);
	dq.add(30);
	dq.add(40);
	dq.add(23);
	dq.add(15);
	
	System.out.println(dq);
	dq.addFirst(11);
	System.out.println("Queue after adding element to first: ");
	System.out.println(dq);
	
	dq.addLast(21);
	System.out.println("Queue after adding element to last: ");
	System.out.println(dq);
	
	dq.removeFirst();
	System.out.println("Queue after removing first element: ");
	System.out.println(dq);
	
	dq.removeLast();
	System.out.println("Queue after removing last element: ");
	System.out.println(dq);
	
	System.out.println(dq.remove(23));
	System.out.println(dq);
	
	dq.push(65);  //pushesh the element @head
	System.out.println(dq);
	
	System.out.println("Peek method: "+dq.peek());
	System.out.println("PeekFirst method: "+dq.peekFirst());
	System.out.println("PeekLast method: "+dq.peekLast());
	System.out.println(dq.poll());
	System.out.println(dq);
	System.out.println(dq.getFirst());
	System.out.println(dq.getLast());
}
}
