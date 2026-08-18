package com.arrays;

import java.util.Arrays;

public class ArrayElements {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<arr.length;i++) {
			System.out.println("For Loop Array : "+arr[i]);
		}
		System.out.println("----------------------");
		for(int a:arr) {
			System.out.println("For Each array : "+a);
		}
		
		//no loop needed for this with out loops also give same output
		System.out.println(Arrays.toString(arr));
	}

}
