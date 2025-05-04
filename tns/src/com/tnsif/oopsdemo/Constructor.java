package com.tnsif.oopsdemo;
//Constructor Overloading

public class Constructor {
	private String name;
	private int age;
	public Constructor(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}

}
