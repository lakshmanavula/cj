package com.lwl.cj.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {

		
			@Test
			public void maxElementWithPostiveNumbersTest() {
				ArrayOperations obj = new ArrayOperations();
				int[] arr = new int[] {2,3,4,5,6,9};
				int actual = obj.max(arr);
				int expected = 9;
				Assertions.assertEquals(expected,actual);
				
			}
			
			@Test
			public void maxElementWithNegativeNumbersTest() {
				ArrayOperations obj = new ArrayOperations();
				int[] arr = new int[] {-2,-3,-4,-5,-6,-9};
				int actual = obj.max(arr);
				int expected = -2;
				Assertions.assertEquals(expected,actual);
				
			}
}
