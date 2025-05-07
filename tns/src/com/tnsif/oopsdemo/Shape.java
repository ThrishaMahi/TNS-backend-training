package com.tnsif.oopsdemo;

abstract class Shape {
	abstract double area();
	abstract double perimeter();
}
class Circle extends Shape {
		private double radius;
		public Circle(double radius) {
			this.radius = radius;
			
		}
		@Override
		double area() {
			return Math.PI*radius*radius;
		}
		double perimeter() {
			return 2*Math.PI*radius;
		}
	}


