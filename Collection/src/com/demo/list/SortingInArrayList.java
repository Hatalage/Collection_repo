package com.demo.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
public static void main(String[] args) {
	ArrayList<String> namelist=new ArrayList<String>();
	namelist.add("radha");
	namelist.add("swati");
	namelist.add("ulka");
	namelist.add("nilam");
	namelist.add("sharda");
	
	System.out.println("-------namelist----------");
	System.out.println(namelist);
	Collections.sort(namelist);
	Collections.reverse(namelist);   //after sorting & reversing will get list in descending order(alphabetically)
	Collections.shuffle(namelist);
	
	System.out.println("-----------collections methods list-------");
	System.out.println(namelist);
}
}
