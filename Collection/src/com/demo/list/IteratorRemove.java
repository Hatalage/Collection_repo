package com.demo.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>numlist=new ArrayList<Integer>();
	
	     numlist.add(10);
	     numlist.add(45);
	     numlist.add(78);
	     numlist.add(99);
	     numlist.add(12);
	     numlist.add(16);
	     
	    
	     /*for (i=0; i<size; i++) {
	    	 int n=numlist.get(i);
	    	 //System.out.println(n);
	    	 
	    	 if (n%2!=0) {
	    		 numlist.remove(i);    //throws IndexOutOfBoundsException as list size is changed
	    	 }
	     }*/
	     
//	     for (Integer n:numlist) {
//	    	 if(n%2!=0) {
//	    		 numlist.remove(n);   //throws ConcurrentModificationException
//	    	 }
//	     }
	    	
	     
	     Iterator<Integer>itr=numlist.iterator();
	     while(itr.hasNext()) {
	    	 if(itr.next()%2!=0) {
	    		//numlist.remove(itr.next());     //throws ConcurrentModificationException
	    		itr.remove();
	    	 }
	     }
	System.out.println("-----after removing odd number------");
	
	for (Integer n:numlist) {
		System.out.println(n);
	}
	
	}

}

