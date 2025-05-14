package com.tnsif.lambdademo;
@FunctionalInterface
interface Cal {
	int cal(int a,int b);
	


}
class MathCal {
	
	public static void main(String[] args) {
		
		//(parameters)->{statements};
		Cal add=(a,b)->a+b;
		Cal mul=(a,b)->a*b;
		
		System.out.println(add.cal(10, 05));
		System.out.println(mul.cal(3,6));
		
	}
}

