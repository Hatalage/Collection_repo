package com.demo.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<Integer> numlist=new ArrayList<Integer>();
		List<Integer> numlist=new CopyOnWriteArrayList<Integer>();
		numlist.add(10);
		numlist.add(20);
		numlist.add(33);
		numlist.add(40);
		
		System.out.println("before numList:"+numlist);
		/*for(int i=0;i<numlist.size();i++) {
			if(numlist.get(i)==33) {
				numlist.set(i, 30);
			}
		}*/
		
		Iterator<Integer> itr=numlist.iterator();
		
		while(itr.hasNext()) {
			int i=itr.next();
			if(i==33)
				numlist.add(30);
			
		}
		System.out.println("after numList:"+numlist);
	}
}
