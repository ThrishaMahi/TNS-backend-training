package com.tns;
//Object type
public class StringDemo1 {
	public static void main(String[] args) {
        String s1 = new String("Thrisha");
        String s2 = new String(s1);
        System.out.println("s1 equals to s2: " + s1.equals(s2));
        System.out.println("s1 compares to s2: " + s1.compareTo(s2));
    }

}
