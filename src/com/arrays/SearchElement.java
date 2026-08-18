package com.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int [] arr= {10,20,30,40,50};
		int target=30;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(arr[i]+" is prsent at index "+i);
			}
		}

	}

}
