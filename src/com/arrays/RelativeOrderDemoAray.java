package com.arrays;

import java.util.Arrays;

public class RelativeOrderDemoAray {

	public static void main(String[] args) {
		int arr[]= {0,1,0,3,12};//o/p->   1 3 12 0 0
		int index=0;//next position to place non-zero element
		for(int i=0;i<arr.length;i++) {// i = current position being checked
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
