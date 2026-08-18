package com.arrays;

public class MergingElement {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 15, 18, 34, 76, 90 };
		int arr[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
				if (arr1[i] < arr2[j]) {
					
                       System.out.print(arr1[i]+" ");
                       i++;
				}
				else {
					System.out.print(arr2[j]+" ");
					j++;
				}
			//i++;
			//j++;
			}
		}
	}


