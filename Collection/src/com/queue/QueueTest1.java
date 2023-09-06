package com.queue;

import java.util.PriorityQueue;

public class QueueTest1 {
public static void main(String[] args) {
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	queue.add(50);
	queue.add(10);
	queue.add(20);
	queue.add(30);
	queue.add(40);
	queue.add(60);
	queue.add(10);
	System.out.println(queue);
	
	queue.offer(14);
	System.out.println(queue);
	
	//remove() with parameters
	//remove and returns true if element is present in queue
	//returns false if element is not present in queue
	boolean ans = queue.remove(330);
	System.out.println("Ans for remove: "+ans);
	System.out.println(queue);
	
	//remove and return head of queue
	//if queue is empty returns null
	Integer i = queue.poll();
	System.out.println("i after poll: "+i);
	System.out.println(queue);
	
	//remove() without parameters
	//does same job like poll() but return NoSuchElementException
	//if queue is empty
	i=queue.remove();
	System.out.println("i after remove():"+i);
	System.out.println(queue);
	
	//return head of the queue but not remove
	//return null if queue is empty
	System.out.println("Peek method: "+queue.peek());
	System.out.println("Size of the queue is: "+queue.size());
	
}
}
