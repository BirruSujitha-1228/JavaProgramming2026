package com.logicalprogramming;

import java.util.Scanner;

public class NthOddNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		nthOdd(n);
		sin.close();

	}

	private static void nthOdd(int n) {
		int odd=2*n-1;
		System.out.println(odd);
		
	}

}
