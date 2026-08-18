package com.arrays;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int[] arr= {45,169,100,78,56};
		int max=arr[0];
		int secondmax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			if(arr[i]!=max && arr[i]>secondmax) {
				secondmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);
	}

}
