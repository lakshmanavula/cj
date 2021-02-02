package com.lwl.cj.array;

public class BinarySearch {

	public int search(int[] arr, int ele) {
	
		int low = 0;
		int high = arr.length;

		while (low < high) {
			int mid = ((low + high) / 2);
			if (arr[mid] == ele) {
				return mid;
			}
			if (ele < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
