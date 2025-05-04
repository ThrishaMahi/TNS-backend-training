package com.tnsif.oopsdemo;
//Runtime-overriding

public class Polymorphism {
	void display() {
		System.out.println("This is runtime polymorphism");
	}
}
	class Poly extends Polymorphism{
		void display() {
			System.out.println("Welcome to java");
		}
	}

	


