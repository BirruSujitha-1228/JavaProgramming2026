package com.arrays;

public class MergeeSorted {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 8, 10 };
		int[] b = { 2, 3, 9 };
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b[0]) {
				int temp = a[i];
				a[i] = b[0];
				b[0] = temp;

				for (int j = 0; j < b.length-1; j++) {
					if (b[j] > b[j + 1]) {
						temp = b[j + 1];
						b[j + 1] = b[j];
						b[j] = temp;
					}
				}
			}

		}
		System.out.print("[ ");
		for (int arr1 : a) {
			System.out.print(arr1+" ");
		}
		for (int arr2 : b) {
			System.out.print(arr2+" ");
		}
		System.out.println("]");
	}
}