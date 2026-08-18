package com.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int[] arr=new int[5];
		int sum=0;
		System.out.println("enter elemnts");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sin.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elemnts are "+sum);

	}

}
