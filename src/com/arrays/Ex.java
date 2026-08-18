package com.arrays;

public class Ex {

	public static void main(String[] args) {
		int[] arr= {30,40,100,12,80,19};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
