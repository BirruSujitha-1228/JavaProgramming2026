package com.logicalprogramming;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		neonNum(n);
		boolean b=isNeon(n);
		System.out.println(b);
		sin.close();

	}

	private static void neonNum(int n) {
		int sqr=n*n;
		int sum=0;
		while(sqr>0) {
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
		}
		if(sum==n) {
			System.out.println("its neon");
		}
		else {
			System.out.println("not neon");
		}
		
	}
	private static boolean isNeon(int n) {
		int sqr=n*n;
		int sum=0;
		while(sqr>0) {
			int digit=sqr%10;
			sum=sum+digit;
			sqr=sqr/10;
		}
		return sum==n;
	}

}
