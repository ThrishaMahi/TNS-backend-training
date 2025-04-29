package com.tnsif.variablesdemo;

public class DemoVarMain {
	public static void main(String[] args) {
		//instance of the class
		DemoTypesVar ob = new DemoTypesVar();
		//instance var call
		int result = ob.numone;
		System.out.println("this is instance output" +result);
		//local variable
		ob.display();
		 //static variable
		System.out.println("this is static variable output" +DemoTypesVar.numthree);
	}

}
