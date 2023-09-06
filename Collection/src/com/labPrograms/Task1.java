package com.labPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	 public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Shivani");
	        list.add("Sharda");
	        list.add("Devansh");
	        list.add("Ansh");
	        list.add("Danish");

	        Iterator<String> itr=list.iterator();
			while(itr.hasNext()) {
				if(itr.next().charAt(0)=='S')
					itr.remove();
			}
			System.out.println("list after removing names staring with s ");
			System.out.println(list);
	    }
	
}

