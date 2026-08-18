package com.arrays;

import java.util.Arrays;

public class MergedElements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 7, 8, 10 };
		int[] arr2 = { 2, 3, 9 };
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr2[0]) {
				int temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
				// swap              
				for (int j = 0; j < arr2.length-1; j++) {
					if (arr2[j] > arr2[j+1]) {
						temp = arr2[j];
						arr2[j] = arr2[j+1];
						arr2[j+1] = temp;
					}
				}
			}
		}
		System.out.print("[ ");
		for (int a : arr1) {
			System.out.print(a+" ");
		}
		for (int b:arr2) {
			System.out.print(b+" ");
		}
		System.out.println("]");
		

	}

}
