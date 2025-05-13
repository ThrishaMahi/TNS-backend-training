package com.tnsif.ExceptionHandlingdemo;

//custom exception
@SuppressWarnings("serial")
public class MyException extends Exception{
	public MyException(String mesg) {
		super(mesg);
	}	
}
