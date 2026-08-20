package com.arrays;

public class FindPosition {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int target = 5;
         System.out.println("--");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (target == arr[i][j]) {
					System.out.println("Index found at position "+"["+i+"]"+"["+j+"]");
				}
			}
		}
		// System.out.println("target "+target);

	}

}
