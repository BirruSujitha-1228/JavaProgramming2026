package com.arrays;

import java.util.Scanner;

public class OneDimensionArr5 {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter sizes");
		int size=sin.nextInt();
		sin.nextLine();
		String[] arr=new String[size];
		System.out.println("Enter names");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sin.nextLine();
			//sin.nextLine();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
