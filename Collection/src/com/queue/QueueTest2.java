package com.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest2 {
public static void main(String[] args) {
	Queue<String> name = new PriorityQueue<String>();
	name.add("aman");
	name.add("raj");
	name.add("rohit");
	name.add("sapna");
	name.add("leena");
	name.add("sapna");
	//name.add(null);   nullPointerException
	
	System.out.println(name);
}
}
