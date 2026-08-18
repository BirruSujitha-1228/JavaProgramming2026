package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter array values");
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=sin.nextInt();
		}
		System.out.print("[");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+",");
			
		}
		System.out.print("]");
		
		System.out.println(Arrays.toString(arr));//original Array

	}

}
