package com.queue;

public class MyQueue {
int arr[];
int front,rear,size;
 
public MyQueue(int size)
{
	front=rear=0;
	this.size=size;
	arr=new int[size];
	System.out.println("Array created of size : "+size);
}
}
