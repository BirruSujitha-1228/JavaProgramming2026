package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageArrayElements {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sin.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sin.nextInt();
		}
		//System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//System.out.print("]");
		System.out.println("Given Elements : "+Arrays.toString(arr));
		
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println();
		System.out.println("Sum of Elemnts are : "+sum);
		avg=sum/arr.length;
		System.out.println("Avg of Given Elemnts Are : "+ avg);

	}

}
