package com.tnsif.lambdademo;
//predefined functional interfaces
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		//test is the abstract method of predicate
		Predicate<String> p=str->str.length()>5;
		System.out.println(p.test("thrisha"));//true
		System.out.println(p.test("TNSIF"));//false
	}


}
