package com.tnsif.DemoJUnit;
//Demo for writing test case
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestMathOperations {
	//positive number
		@Test
		public void testForPostive() {
			
		  Assertions.assertTrue(MathOperations.positiveNumber(59087));	
			
		}
		
		
		
	//negative number
		@Test
		public void testForNegative() {
			  Assertions.assertFalse(MathOperations.positiveNumber(-5));	
		}


}
