package com.lwl.cj.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
		
		@Test
		public void searchWithElementPresent() {
			BinarySearch obj = new BinarySearch();
			int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
			int ele = 2;
			int expected = 1;
			int actual = obj.search(arr, ele);
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		public void searchWithElementNotPresent() {
			BinarySearch obj = new BinarySearch();
			int[] arr = new int[] {3,4,5,6,7,8,9};
			int ele = 10;
			int expected = -1;
			int actual = obj.search(arr, ele);
			Assertions.assertEquals(expected, actual);
		}
		
		
}
