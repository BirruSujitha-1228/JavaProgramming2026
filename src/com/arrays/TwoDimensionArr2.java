package com.arrays;

import java.util.Scanner;

public class TwoDimensionArr2 {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter 2 sizes ");
		int size1=sin.nextInt();
		int size2=sin.nextInt();
		int[][] arr =new int[size1][size2];
		System.out.println("Enter arry elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)// it tells how many colums in that row
			arr[i][j]=sin.nextInt();
		}
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			if(i<arr.length-1)
			System.out.println();
			
		}
		System.out.print("]");
		

	}

}

