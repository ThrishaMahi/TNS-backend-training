package com.tnsif.variablesdemo;
//Demo for static variable
public class Student {
	int sid;
	String sname;
	static String collegename = "Sri Indu";//It is common value - the memory is allocated only once
	
	void display() {
		System.out.println("The details of the student " +sid+"," +sname+","+Student.collegename);
		
	}

}
