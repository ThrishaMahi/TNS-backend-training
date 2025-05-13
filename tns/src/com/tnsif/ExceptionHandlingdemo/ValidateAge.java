package com.tnsif.ExceptionHandlingdemo;

public class ValidateAge {
	public static void validateAge(int age) throws MyException,ArithmeticException {
		if(age<0) {
			throw new MyException("The entered age is not valid");
		}
		else {
			System.out.println("The age is valid");
		}
	}


}
