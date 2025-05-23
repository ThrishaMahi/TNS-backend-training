package com.tnsif.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeMain {
	public static void main(String[] args) {
	     List<Employee> l=new ArrayList<Employee>();
			
			l.add(new Employee(101,"Srilatha",45789.45f));
			l.add(new Employee(102,"Sushma",75789.45f));
			l.add(new Employee(103,"Swetha",85889.45f));
			l.add(new Employee(104,"ALex",72789.45f));
			l.add(new Employee(105,"Candy",95789.45f));
			l.add(new Employee(106,"Balu",55789.45f));
			//filter data based on salary ->>72000
			Stream<Employee> st= l.stream()
								.filter(sal->sal.esal>72000.00f);
			
				st.forEach(n->System.out.println
						("Eid"+n.empid+"Ename"+n.ename));
			
			
			//map (retrieve the names of employee in upper case)
				
			String[] str= {"Sam","lavanya","Divya","Dolly"};
			System.out.println("stored operations");	
		    List<String> name=Arrays.asList("Bobby","Amith","Sarath");
//				
//			//String s=new String();
//			//s.toUpperCase();
//			name.stream().map(String::toUpperCase)
//			.forEach(System.out::println);
				
			System.out.println("stored operations + Map");	
			List<String> names=Arrays.asList("Bobby","Amith","Sarath");
		    names.stream().sorted().map(String::toUpperCase).
				forEach(System.out::println);
				
			System.out.println("reduce operation");	
	       List<Integer> number=Arrays.asList(10,30,40,60);
	       //BiFUnction<T,U,R>->t- one vale, u is 2nd value,R -> result
	       //of T and U
	       int sum=number.stream().reduce(0,Integer::sum);
		    System.out.println("The sum is"+sum);
		   
		   
		   
		}


}
