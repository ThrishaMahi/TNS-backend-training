package com.tnsif.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
	      
	  	List<Student> l=new ArrayList<Student>();
//			
	       	l.add(new Student(101,"kavya","CSE",8.9f,21));
	        l.add(new Student(102,"kavitha","CSE",8.7f,23));
	       l.add(new Student(103,"Santosh","CSE",7.9f,18));
		l.add(new Student(104,"Srija","DS",9.1f,18));
		
		Collections.sort(l);
		for(Student i:l) {
		System.out.println(i);
	     }
	}

}
