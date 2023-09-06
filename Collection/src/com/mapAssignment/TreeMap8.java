package com.mapAssignment;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//WAP to sort keys in TreeMap by using comparator
 class Student{
	String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class AccordingMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
}

public class TreeMap8{
    public static void main(String[] args) {
        TreeMap<Student, Integer> treeMap = new TreeMap<>(new AccordingMarks());
        treeMap.put(new Student("Akshay", 400), 1);
        treeMap.put(new Student("Bina", 200), 2);
        treeMap.put(new Student("Chintu", 300), 3);
        System.out.println("TreeMap keys sorting in ascending order of the marks:");
        for (Map.Entry<Student, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key : (" + entry.getKey().name + ": " + entry.getKey().marks + "), Value : " + entry.getValue());
        }
    }
}

