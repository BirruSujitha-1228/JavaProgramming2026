package com.arrays;

public class MaxElementInArray {

	public static void main(String[] args) {
		// int[] arr=new int[5];
		int[] arr = { 10, 45,23, 67, 12 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {// 10>10 false--->20>10 true
				max = arr[i];
			}
		}
		System.out.println("Max element "+max);
	}

}
