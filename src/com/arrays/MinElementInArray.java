package com.arrays;

import java.util.Scanner;

public class MinElementInArray {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sin.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {// better to read from 1 because we already assume that arr[0] is min
			arr[i] = sin.nextInt();
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Min element in array is : " + min);

	}

}
