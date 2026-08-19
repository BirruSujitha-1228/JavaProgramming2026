package com.logicalprogramming;

import java.util.Scanner;

public class NtoOne {
	

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n value");
        int n=sin.nextInt();
        ntoOne(n);
        sin.close();
	}

	private static void ntoOne(int n) {
		int i=n;//5
		while(i>=1) {
			System.out.println(i);
			i=i-1;
		}
		for( i=n;i>=1;i--) {
			System.out.println(i);
		}
		
	}
	

}
