package com.tnsif.oopsdemo;

public class ShapeMain {
	public static void main(String args[]) {
		Shape s=new Circle(5);
		s.area();
		s.perimeter();
		System.out.println("Area"+s.area());
		System.out.println("Perimeter"+s.perimeter());
	}

}
