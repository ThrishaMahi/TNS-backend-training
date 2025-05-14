package com.tnsif.CollectionsDemo;
//demo for Comparable
public class Student implements Comparable<Student>{
	
	public int sid;
	public String sname;
	public String branch;
	public float cgpa;
	public int age;
	public Student(int sid, String sname, String branch, float cgpa, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch = branch;
		this.cgpa = cgpa;
		this.age = age;
	}
	
	//greater - 1, lesser - -1, zero --> equal
	//18, 20, 21, 23
	//age(18)==s.age(20)
	
	public int compareTo(Student s) {
		if(age==s.age)
		return 0;
		else if(age>s.age)
		return 1;
		else
		return -1;
			
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", cgpa=" + cgpa + ", age=" + age
				+ "]";
	}
	}


