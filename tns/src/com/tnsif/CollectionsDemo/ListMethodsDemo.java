package com.tnsif.CollectionsDemo;

	import java.util.*;

	public class ListMethodsDemo {
	    public static void main(String[] args) {
	        // Create a List of Strings
	        List<String> list = new ArrayList<>();

	        // boolean add(E e)
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("After adding: " + list);

	        // int size()
	        System.out.println("Size: " + list.size());

	        // boolean isEmpty()
	        System.out.println("Is empty? " + list.isEmpty());

	        // boolean contains(Object o)
	        System.out.println("Contains 'Banana'? " + list.contains("Banana"));
	        System.out.println("Contains 'Date'? " + list.contains("Date"));

	        // Iterator<E> iterator()
	        System.out.print("Using iterator: ");
	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }
	        System.out.println();

	        // Object[] toArray()
	        Object[] array = list.toArray();
	        System.out.print("Array: ");
	        for (Object obj : array) {
	            System.out.print(obj + " ");
	        }
	        System.out.println();

	        // boolean remove(Object o)
	        list.remove("Banana");
	        System.out.println("After removing 'Banana': " + list);

	        // boolean retainAll(Collection<?> c)
	        List<String> keepOnly = Arrays.asList("Apple", "Date");
	        list.retainAll(keepOnly);
	        System.out.println("After retainAll (only Apple and Date): " + list);

	        // boolean add again
	        list.add("Date");
	        list.add("Elderberry");
	        System.out.println("After adding more: " + list);

	        // void clear()
	        list.clear();
	        System.out.println("After clear: " + list);

	        // Final isEmpty check
	        System.out.println("Is list empty now? " + list.isEmpty());
	    }
	}


