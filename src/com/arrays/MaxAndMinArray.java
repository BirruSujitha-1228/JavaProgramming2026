package com.arrays;

import java.util.Scanner;

public class MaxAndMinArray {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter size: ");
		int size=sin.nextInt();
		System.out.println("Enter array Elements");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sin.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max element "+max);
		System.out.println("Min element "+min);

	}

}
