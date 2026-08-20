package com.arrays;

import java.util.Scanner;

public class SumOfDiagonal {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int leftSum=0;
		int rightSum=0;
		for(int i=0;i<arr.length;i++) {
			leftSum+=arr[i][i];
			rightSum+=arr[i][arr.length-1-i];
		}
		    System.out.print("left diaognal sum ");
			System.out.print(leftSum);
			System.out.print("\nright diaognal sum ");
			System.out.print(rightSum);

	}
}

