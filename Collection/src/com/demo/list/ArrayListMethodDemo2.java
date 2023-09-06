package com.demo.list;

import java.util.ArrayList;

public class ArrayListMethodDemo2 {
public static void main(String[] args) {
ArrayList<String> namelist1=new ArrayList<String> ();
namelist1.add("shivani");
namelist1.add("sourabh");
namelist1.add("sapna");
namelist1.add("sharda");
namelist1.add("shreyash");

ArrayList<String> namelist2=new ArrayList<String> ();
namelist2.add("shiv");
namelist2.add("shivu");
namelist2.add("shiva");
namelist2.add("shivi");
namelist2.add("shonu");

namelist1.addAll(namelist2);

System.out.println(namelist1);
System.out.println(namelist2);

boolean ans=namelist1.containsAll(namelist2);
System.out.println("ans:"+ans);
boolean ans1 = namelist1.contains("shiv");
System.out.println(ans1);
}
}
