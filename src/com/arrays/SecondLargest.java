package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {10, 25, 7, 40,40, 30, 15};
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
		System.out.println(secondmax);
		System.out.println(max);

	}

}
