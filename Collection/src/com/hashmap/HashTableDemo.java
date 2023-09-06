package com.hashmap;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
	// initial capacity of hashtable is 11
	// load factor is 0.75 
		public static void main(String[] args) {
			
					Hashtable<Integer,String> table = new Hashtable<Integer,String>();
					//thread-safe
					//default cap is 11 and load-factor is 0.75
					// hashtable is legency class , used enumeration class
			table.put(202, "raj");
			table.put(105, "yami");
			table.put(103, "sonal");
			//table.put(104, null);
			//table.put(null, "kavita"); //Enumeration //gives nullPointerException
			
			System.out.println("------ Hashtable ---------");
			System.out.println(table);
			
		//	nextelement check whether the element is present or not in hashtable
			
			System.out.println("------ hashtable by enumeration-----------");
			Enumeration ele = table.elements();
			
			while(ele.hasMoreElements()) // gives key-value
			{
				System.out.println(ele.nextElement());
			}
			
			
			Enumeration<Integer> keys = table.keys(); //gives key
			while(keys.hasMoreElements())
			{
				Integer i = keys.nextElement();
				System.out.println(i + "  " +table.get(i)); // fetch key - value
			}
			
			
		
			//////////////////////////////////////////////////////////////////////////////
			
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(101, "raj");
			map.put(109, "leena");
			//non-synchronized
			//fast
			//not thread-safe
			//default cap is 16 and LF is 0.75
			
			System.out.println("\n------- HashMap --------");
			System.out.println(map);
			
			//listIterator used for only list
			// iterTOR USED FOR LEGECY CLASSES
			
			System.out.println("----USing iterator----");
			Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
		
			while(itr.hasNext())
			{
				Map.Entry<Integer,String>  entry = itr.next();
				System.out.println(entry.getKey() + "   " + entry.getValue());
				System.out.println(itr.next());
			}
		//iterator used for hashtable as well as hashtable
		
		}
	}

