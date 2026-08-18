package com.arrays;

public class SumOfOddArrayElements {

	public static void main(String[] args) {
		int sum=0;
		int[] arr= {10, 7, 4, 9, 12, 5, 8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
