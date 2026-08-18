package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwodimensionArr6 {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		String[][] arr=new String[2][3];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sin.nextLine();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
		for(String [] a:arr) {
			for(String a1:a) {
				System.out.print(a1+" ");
			}
			System.out.println();
		}
	}

}
