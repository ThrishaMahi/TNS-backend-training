package com.tnsif.Generics;
//Demo for applying Generic on a method
public class GenericMethodDemo {
	//List<Integer> l=new ArrayList<>();
	public static<T> void displayArray(T[] array) {
		//for(returntype varname:arrayname)
		for(T i:array) {
			System.out.println("Array elements"+i);
		}
	}
}


