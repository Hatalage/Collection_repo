package com.mapAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//WAP to empty Map. (Hint - Get keys and iterate through the keys to remove entries fromMap)
public class Example14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		Scanner in=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("Enter the key");
			int key=in.nextInt();
			System.out.println("Enter the value");
			String value=in.next();

			map.put(key, value);

		}
		Iterator<Map.Entry<Integer, String>> m=map.entrySet().iterator();
		while(m.hasNext()){
			m.next();
			m.remove();
		}
		System.out.println("Map is empty now!!"+map.isEmpty());
	}

}

