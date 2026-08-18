package com.arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,4};
		boolean[] temp=new boolean[10];
		for(int i=0;i<arr.length-1;i++) {
			boolean find =false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
			        find=true;
					//System.out.println(arr[j]);
					break;
					
				}
			}
			if(find) {
				System.out.println(arr[i]);
			}
			
		}

	}

}
