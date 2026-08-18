package com.logicalprogramming;

import java.util.Scanner;

public class DivisibilityCheck {
	static void isDivisible(int n) {
		if (n % 5 == 0 && n % 11 == 0) {
			System.out.println("divisible by both 5 and 11");
		} else if (n % 5 == 0) {
			System.out.println("divisible by 5 ");
		} else if (n % 11 == 0) {
			System.out.println("divisible by 11");
		} else {
			System.out.println("Not divisible by 5 or 11");
		}
	}

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sin.nextInt();
		isDivisible(n);
		sin.close();
	}

}
