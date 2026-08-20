package com.arrays;

import java.util.Scanner;

public class MaxAndMinIn2DArray {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int[][] arr=new int[2][2];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sin.nextInt();
			}
		}
		int max=arr[0][0];
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		sin.close();
		

	}

}
