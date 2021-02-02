package com.lwl.cj.basics;

public class ArrayOperations {

	
	public int max(int[] arr) {
		int maxEle = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxEle < arr[i]) {  
				maxEle = arr[i];
			}
		}
		return maxEle;
	}
	public int search(int[] arr, int ele) {
		if(arr.length == 0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}
}
