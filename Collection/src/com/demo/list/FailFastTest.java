package com.demo.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nlist=new CopyOnWriteArrayList<String>();
		nlist.add("pooja");
		nlist.add("leena");
		nlist.add("usha");
		
		Iterator<String>itr=nlist.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals("usha")) {
				nlist.add("priya");
			}
		
		}
		
		System.out.println(nlist);
	}

}
