package com.tnsif.CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
public static void main(String args[]) {
		
		int a=10;
		//wrapper class
		//int --> Integer
		//float --> Float, double --> Double,short --> Short
		
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		//ll.add("SriIndu");
		//ll.add(3.4f);
		//ll.add("true");
		
		for(int i:ll) {
			System.out.println("The elements in List interface"+i);
		}
		
	
		//LinkedList
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(10);
		l.add(34);
		l.add(23);
		System.out.println("Before Deletion");
		for(int i:l) {
			System.out.println(i);
		}
		
		l.remove(1);
		System.out.println("After Deletion");
		for(int i:l) {
			System.out.println(i);
		}
	}


}
