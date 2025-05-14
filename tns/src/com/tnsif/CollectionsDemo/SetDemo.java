package com.tnsif.CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String args[]) {
		//HashSet --> Does not allow duplicates, Insertion order is not preserved
		Set<Integer> ll=new HashSet<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		for(int i:ll) {
			System.out.println("The elements in Set interface"+i);
		}
		
		System.out.println("Exceution using LinkedHashset");
		//LinkedHashSet --> Insertion order preserved & no duplicates
				Set<Integer> l=new LinkedHashSet<Integer>();
				l.add(10);
				l.add(10);
				l.add(34);
				l.add(23);
				for(int i:l) {
					System.out.println(i);
				}
				System.out.println("Exceution using Treeset");
				//TreeSet --> follows natural sorting order & no duplicates
				SortedSet<Integer> ts=new TreeSet<Integer>();
				ts.add(10);
				ts.add(10);
				ts.add(34);
				ts.add(23);
				for(int i:ts) {
					System.out.println(i);
				}	
				
}


}
