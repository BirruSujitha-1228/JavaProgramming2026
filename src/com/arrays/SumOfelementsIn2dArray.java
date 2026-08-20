package com.arrays;

import java.util.Scanner;

public class SumOfelementsIn2dArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sin=new Scanner(System.in);
		int[][] arr=new int[2][2];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sin.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println();
		}
		System.out.println("sum is : "+sum);
		

	}

}
