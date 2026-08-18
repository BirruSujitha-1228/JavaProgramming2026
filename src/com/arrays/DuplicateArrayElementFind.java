package com.arrays;

public class DuplicateArrayElementFind {

	public static void main(String[] args) {
		int[] arr= {8,4,6,4,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					System.out.println(arr[i]);
					break;
				}
				
			}
		}

	}

}
